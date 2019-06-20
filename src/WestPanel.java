import javax.swing.*;
import java.awt.*;

public class WestPanel extends JScrollPane {
    private JPanel mainPanel=new JPanel();

    public WestPanel(){
        mainPanel.setSize(100 , 800);
        GridBagLayout ly=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill = GridBagConstraints.VERTICAL;
        mainPanel.setLayout(ly);

        setViewportView(mainPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton Home = new JButton("Home");
        mainPanel.add(Home , gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton addMusic = new JButton("addMusic");
        mainPanel.add(addMusic , gbc);

        JButton jButton=new JButton("Library");

//        jButton.enable(false);

        gbc.gridx=0;
        gbc.gridy=2;
        mainPanel.add(jButton,gbc);

        JButton Albums=new JButton("Alubms");
        gbc.gridx=0;
        gbc.gridy=3;
        mainPanel.add(Albums,gbc);


        JButton Songs=new JButton("Songs");
        gbc.gridx=0;
        gbc.gridy=4;
        mainPanel.add(Songs,gbc);


        JButton PlayList=new JButton("PlayList");
        gbc.gridx=0;
        gbc.gridy=5;
        mainPanel.add(PlayList,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 0;       //reset to default
        gbc.weighty = 1.0;   //request any extra vertical space
        gbc.anchor = GridBagConstraints.PAGE_END; //bottom of space
        gbc.insets = new Insets(10,0,0,0);  //top padding
        gbc.gridx = 0;       //aligned with button 2
        gbc.gridwidth = 2;   //2 columns wide
        gbc.gridy = 3;
        JButton newPlayList = new JButton("newPlayList");
        mainPanel.add(newPlayList , gbc);




    }
}