package Ultilites;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class _DataValidator {

    // hàm xử lí validata của text field nhập xuất
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage) {
        if(field.getText().equals("")) {
            sb.append(String.format("%s\n", errorMessage));
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    // hàm xử lí validata của text area nhập xuất
    public static void validateEmpty(JTextArea field, StringBuilder sb, String errorMessage) {
        if(field.getText().equals("")) {
            sb.append(String.format("%s\n", errorMessage));
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    // hàm xử lí validata của group button nhập xuất
    public static void validateEmpty(ButtonGroup field, StringBuilder sb, String errorMessage) {
        if(field.getSelection() == null) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí checkbox list có empty  hay không ?
    public static ArrayList<String> vaidateArraylistCheckBox(ArrayList<JCheckBox> listCB, StringBuilder sb, String errorMessage) {
        ArrayList<String> result = new ArrayList<>();
        int countCheckBoxUsing = 0;
        int totalCheckBox = listCB.size();
        for(AbstractButton item : listCB) {
            if(item.isSelected()) {
                countCheckBoxUsing++;
                result.add(item.getText());
            }
        }

        if(countCheckBoxUsing > 0) {
            return result;
        } else {
            sb.append(String.format("%s\n", errorMessage));
            return null;
        }
    }
}
