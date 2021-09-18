import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movie extends JFrame {
    private JPanel Main;
    private JTextField txtName;
    private JButton button1;
    private JTextField nameTextField;
    private JTextField txtSeason;
    private JTextField txtEpisode;
    private JButton searchButton;

    public Movie() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=txtName.getText();
                MovieLinks.openLinkMovie(name);



            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=nameTextField.getText();
                String season=txtSeason.getText();
                String episode=txtEpisode.getText();
                MovieLinks.openLinkSeries(name,season,episode);
            }
        });
    }

    public static void main(String[] args) {
        Movie frame=  new Movie();
        frame.setContentPane(new Movie().Main);
        frame.setDefaultCloseOperation(Movie.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
