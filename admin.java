
package miniTwitter;

import javax.swing.*;
import javax.swing.tree.*;

public class admin extends javax.swing.JFrame {
    private int userCount;
    private int groupCount;
    
    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        userCount = 8;
        groupCount = 2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        UserId = new javax.swing.JTextField();
        GroupId = new javax.swing.JTextField();
        jButtonAddUser = new javax.swing.JButton();
        jButtonAddGroup = new javax.swing.JButton();
        UserView = new javax.swing.JButton();
        ShowUserTotal = new javax.swing.JButton();
        MessagesTotal = new javax.swing.JButton();
        ShowGroupTotal = new javax.swing.JButton();
        PositivePerentage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Group1");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("brody");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("tommy");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Group2");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("sammy");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("vanna");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("allison");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("carson");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        UserId.setText("User Id");

        GroupId.setText("Group Id");

        jButtonAddUser.setText("Add User");
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jButtonAddGroup.setText("Add Group");
        jButtonAddGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddGroupActionPerformed(evt);
            }
        });

        UserView.setText("Open User View");
        UserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserViewActionPerformed(evt);
            }
        });

        ShowUserTotal.setText("Show User Total");
        ShowUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowUserTotalActionPerformed(evt);
            }
        });

        MessagesTotal.setText("Messeages Total");
        MessagesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessagesTotalActionPerformed(evt);
            }
        });

        ShowGroupTotal.setText("Show Group Total");
        ShowGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowGroupTotalActionPerformed(evt);
            }
        });

        PositivePerentage.setText("Positive Percentage");
        PositivePerentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositivePerentageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addComponent(UserView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MessagesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PositivePerentage, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShowUserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowGroupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(UserId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GroupId, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(jButtonAddGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserView, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShowUserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowGroupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MessagesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PositivePerentage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void UserViewActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Switch to the UserView Frame
        
        String selectedText = null;
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedText = selectedNode.getUserObject().toString();
            
            System.out.println("Selected Node Text: " + selectedText);
        }

        UserView userView = new UserView(selectedText);
        userView.show();
    }                                        

    private void ShowUserTotalActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String count = Integer.toString(userCount);
        JOptionPane.showMessageDialog(admin.this, "Total Users: " + count);
    }                                             

    private void ShowGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String count = Integer.toString(groupCount);
        JOptionPane.showMessageDialog(admin.this, "Total Groups: " + count);
    }                                              

    private void PositivePerentageActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    float count = (counters.getPosCount()/counters.getTweetCount()) * 100;
    JOptionPane.showMessageDialog(admin.this, "Positive Percentage: " + count + "%");
    }                                                 

    private void MessagesTotalActionPerformed(java.awt.event.ActionEvent evt) {                                              
        float count = counters.getTweetCount();
        JOptionPane.showMessageDialog(admin.this, "Total Tweets: " + count);
    }                                             

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {                                               

    DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
    TreePath selectedPath = jTree1.getSelectionPath();
    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();
    
    String newUserId = UserId.getText();

    // Check if the new UserID already exists in the selected node
    boolean isDuplicate = false;
    for (int i = 0; i < selectedNode.getChildCount(); i++) {
        DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) selectedNode.getChildAt(i);
        if (childNode.getUserObject().equals(newUserId)) {
            isDuplicate = true;
            break;
        }
    }

    if(!isDuplicate){
    // Create the new node with a meaningful user object, e.g., folder name
    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(UserId.getText());
    newNode.setAllowsChildren(false); // Allow the new node to have child nodes (objects)
    // Add the new node as a child to the selected node
    selectedNode.add(newNode);

    // Update the tree model to reflect the changes
    treeModel.nodeStructureChanged(selectedNode);

    // Select the new node in the tree
    jTree1.setSelectionPath(selectedPath);
    }
    userCount ++;
    }                                              

    private void jButtonAddGroupActionPerformed(java.awt.event.ActionEvent evt) {                                                
    DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
    TreePath selectedPath = jTree1.getSelectionPath();
    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();

    // Create the new node with a meaningful user object, e.g., folder name
    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(GroupId.getText()) {
        @Override
        public boolean isLeaf() {
            return false;
        }
    };    

    // Add the new node as a child to the selected node
    selectedNode.add(newNode);

    // Update the tree model to reflect the changes
    treeModel.nodeStructureChanged(selectedNode);

    // Select the new node in the tree
    jTree1.setSelectionPath(selectedPath.pathByAddingChild(newNode));
    groupCount ++;
    }                                               


    // Variables declaration - do not modify                     
    private javax.swing.JTextField GroupId;
    private javax.swing.JButton MessagesTotal;
    private javax.swing.JButton PositivePerentage;
    private javax.swing.JButton ShowGroupTotal;
    private javax.swing.JButton ShowUserTotal;
    private javax.swing.JTextField UserId;
    private javax.swing.JButton UserView;
    private javax.swing.JButton jButtonAddGroup;
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration                   
}
