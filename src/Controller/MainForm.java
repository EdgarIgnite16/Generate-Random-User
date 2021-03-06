package Controller;

import Model.user;
import Ultilites.HandleDatabase;
import Ultilites._DataValidator;
import Ultilites._MessageDialogHelper;
import Ultilites._OptionGenerate;
import com.k33ptoo.KRandomUser;
import com.k33ptoo.KRandomUserModel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Utilities;
import java.awt.*;
import java.util.ArrayList;

public class MainForm extends javax.swing.JFrame {
    private final ArrayList<JCheckBox> listOptions = new ArrayList<>();
    private final ArrayList<user> userList = new ArrayList<user>();
    private String dbName, tbName;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    public void initOption() {
        ArrayList<String> listOptionsItem = new _OptionGenerate().getData();
        int rowItem = listOptionsItem.size();
        int colItem = rowItem/4 + 1;

        pnChosser.setLayout(new GridLayout(colItem, rowItem, 5, 5));
        for(String item : listOptionsItem) {
            JCheckBox jCheckBox = new JCheckBox();
            jCheckBox.setText(item);
            jCheckBox.setFont(new Font("Segoe UI", 0 , 12));
            pnChosser.add(jCheckBox);
            listOptions.add(jCheckBox);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnConfig = new javax.swing.JPanel();
        lbDatabaseName = new javax.swing.JLabel();
        lbTableName = new javax.swing.JLabel();
        lbSizeGenerate = new javax.swing.JLabel();
        txtDatabaseName = new javax.swing.JTextField();
        txtTableName = new javax.swing.JTextField();
        txtSizeGenerate = new javax.swing.JTextField();
        pnChosser = new javax.swing.JPanel();
        btnGenerate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generate Random User - author Edgar Ignite");
        setResizable(false);

        pnConfig.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Config Database", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lbDatabaseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDatabaseName.setText("Database Name: ");

        lbTableName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTableName.setText("Table Name:");

        lbSizeGenerate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSizeGenerate.setText("Size Generate");


        txtDatabaseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDatabaseName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }
        });

        txtTableName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTableName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }
        });

        txtSizeGenerate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSizeGenerate.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                eventChangeUpdate(e);
            }
        });

        javax.swing.GroupLayout pnConfigLayout = new javax.swing.GroupLayout(pnConfig);
        pnConfig.setLayout(pnConfigLayout);
        pnConfigLayout.setHorizontalGroup(
                pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnConfigLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbSizeGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbDatabaseName)
                                        .addComponent(lbTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTableName)
                                        .addComponent(txtDatabaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSizeGenerate))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnConfigLayout.setVerticalGroup(
                pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnConfigLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDatabaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbDatabaseName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTableName)
                                        .addComponent(txtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSizeGenerate)
                                        .addComponent(txtSizeGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnChosser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chosing Instance Value", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        this.initOption();

        btnGenerate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerate.setText("Start Generate");
        btnGenerate.setEnabled(false);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnChosser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGenerate)
                                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnChosser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnExit)
                                        .addComponent(btnGenerate))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder errorString = new StringBuilder();
         try {
             _DataValidator.validateEmpty(txtDatabaseName, errorString, "Vui l??ng nh???p t??n Database");
             _DataValidator.validateEmpty(txtTableName, errorString, "Vui l??ng nh???p t??n Table");
             _DataValidator.validateEmpty(txtSizeGenerate, errorString, "Vui l??ng nh???p s??? l?????ng user c???n generate");
             ArrayList<String> listCode = _DataValidator.vaidateArraylistCheckBox(listOptions, errorString, "Vui l??ng ch???n ??t nh???t 1 tr?????ng ????? kh???i t???o");

            if(errorString.length() > 0) {
                 _MessageDialogHelper.showErrorDialog(this, String.valueOf(errorString), "Error Input Value");
             } else {
                dbName = txtDatabaseName.getText().trim();
                tbName = txtTableName.getText().trim();
                 int sizeGenerate = Integer.parseInt(txtSizeGenerate.getText().trim());
                 if(sizeGenerate > 0 && sizeGenerate <= 100) {
                     String msg = String.format("X??c nh???n kh???i t???o database v???i d??? li???u\n" +
                             "database name: %s\ntable name: %s\nSize generated: %d", dbName,tbName, sizeGenerate);
                     if(JOptionPane.showConfirmDialog(this, msg,
                             "Create Database and Generate Random User", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                         for(String item : listCode) {
                             System.out.println(item);
                         }
                         handleCreateValue(listCode, sizeGenerate);
                     }
                 } else {
                     _MessageDialogHelper.showErrorDialog(this,"Vui l??ng nh???p s??? l?????ng generate l???n h??n 0 v?? nh??? h??n 100", "Error you mother fucker");
                 }
             }

         } catch (Exception ex) {
             ex.printStackTrace();
         }
    }


    private void handleCreateValue(ArrayList<String> listItem, int sizeGenerate) throws Exception {
        try {
            SwingUtilities.invokeLater(() -> {
                KRandomUser.fetchRandomUserList(sizeGenerate, listUser -> {
                    for(KRandomUserModel userK : listUser) {
                        user userItem = new user();
                        for(String item : listItem) {
                            if(item.equals("Id")) userItem.setId(userK.getId());
                            if(item.equals("Uid")) userItem.setUid(userK.getUid());
                            if(item.equals("Username")) userItem.setUsername(userK.getUsername());
                            if(item.equals("Email"))  userItem.setEmail(userK.getEmail());
                            if(item.equals("Firstname")) userItem.setFirstname(userK.getFirstName());
                            if(item.equals("Lastname"))  userItem.setLastname(userK.getLastName());
                            if(item.equals("Address"))  userItem.setAddress(String.valueOf(userK.getAddress()));
                            if(item.equals("PhoneNumber"))  userItem.setPhoneNumber(userK.getPhoneNumber());
                            if(item.equals("DateOfBirth")) userItem.setDateOfBirth(userK.getDateOfBirth());
                            if(item.equals("Gender"))  userItem.setGender(userK.getGender());
                            if(item.equals("Password")) userItem.setPassword(userK.getPassword());
                            if(item.equals("SocialInsuranceNumber")) userItem.setSocialInsuranceNumber(userK.getSocialInsuranceNumber());
                        }
                        userList.add(userItem);
                    }
                });
                for(user item : userList) {
                    System.out.println(item.toString());
                }
            });
            handleProcessDatabase();
            _MessageDialogHelper.showMessageDialog(this,
                    "B???n ???? kh???i t???o th??nh c??ng database!\nVui l??ng ki???m tra l???i trong CSDL!", "Created Success");
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }

    public void handleProcessDatabase() {
        HandleDatabase handleDB = new HandleDatabase();
        try {
            try {
                handleDB.createTable(dbName, tbName);
                for(user item : userList) {
                    handleDB.insertData(dbName, tbName, item);
                }
                System.out.println("Insert d??? li???u th??nh c??ng");
                System.exit(0);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());;
                _MessageDialogHelper.showErrorDialog(this, "Table ???? t???n t???i !", "Error Mother Fucker");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void eventChangeUpdate(DocumentEvent e) {
        btnGenerate.setEnabled(!txtTableName.getText().isEmpty() && !txtDatabaseName.getText().isEmpty());
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JLabel lbDatabaseName;
    private javax.swing.JLabel lbSizeGenerate;
    private javax.swing.JLabel lbTableName;
    private javax.swing.JPanel pnChosser;
    private javax.swing.JPanel pnConfig;
    private javax.swing.JTextField txtDatabaseName;
    private javax.swing.JTextField txtSizeGenerate;
    private javax.swing.JTextField txtTableName;
    // End of variables declaration
}

