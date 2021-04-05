  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmenu;

import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author MGI
 */
public class JavaFXMenu extends Application {
    private String text = "";
    @Override
    public void start(Stage primaryStage) {
        
        //Piechart
        
        PieChart pieChart = new PieChart();
        
        PieChart.Data slice1 = new PieChart.Data("Desktop", 213);
        PieChart.Data slice2 = new PieChart.Data("Phone"  , 67);
        PieChart.Data slice3 = new PieChart.Data("Tablet" , 36);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);

        VBox vbox = new VBox(pieChart);
        
       // set title for the stage 
        primaryStage.setTitle("Java Netbeans MenuBar");
        
         // create a menu 
        Menu menu1 = new Menu("FILE");
        Menu menu2 = new Menu("EDIT");
        Menu menu3 = new Menu("VIEW");
        Menu menu4 = new Menu("NAVIGATE");
        Menu menu5 = new Menu("SOURCE");
        Menu menu6 = new Menu("REFACTOR");
        Menu menu7 = new Menu("RUN");
        Menu menu8 = new Menu("DEBUG");
        Menu menu9 = new Menu("PROFILE");
        Menu menu10 = new Menu("TOOLS");
        
        // create menuitems 
        MenuItem filemenu1 = new MenuItem("NEW PROJECT"); 
        MenuItem filemenu2 = new MenuItem("NEW FILE"); 
        MenuItem filemenu3 = new MenuItem("OPEN PROJECT"); 
        
        MenuItem editmenu1 = new MenuItem("UNDO"); 
        MenuItem editmenu2 = new MenuItem("CUT"); 
        
        MenuItem viewmenu1 = new MenuItem("EDITORS"); 
        MenuItem viewmenu2 = new MenuItem("CODE FOLDS"); 
        MenuItem viewmenu3 = new MenuItem("IDE LOGS");
        MenuItem viewmenu4 = new MenuItem("SPLITS");
        
        MenuItem navigatemenu1 = new MenuItem("BACK"); 
        MenuItem navigatemenu2 = new MenuItem("FORWARD"); 
        
        MenuItem sourcemenu1 = new MenuItem("FORMAT"); 
      
        MenuItem refactormenu1 = new MenuItem("RENAME"); 
        MenuItem refactormenu2 = new MenuItem("MOVE"); 
        MenuItem refactormenu3 = new MenuItem("COPY");
        MenuItem refactormenu4 = new MenuItem("INLINE");
        
        MenuItem runmenu1 = new MenuItem("RUN PROJECT"); 
        MenuItem runmenu2 = new MenuItem("TEXT PROJECT"); 
        
        MenuItem debugmenu1 = new MenuItem("DEBUG PROJECT"); 
        MenuItem debugmenu2 = new MenuItem("DUBUG FILE"); 
        
        // add menu items to the MENU
        menu1.getItems().add(filemenu1); 
        menu1.getItems().add(filemenu2); 
        menu1.getItems().add(filemenu3);
        
        menu2.getItems().add(editmenu1); 
        menu2.getItems().add(editmenu2); 
   
        menu3.getItems().add(viewmenu1); 
        menu3.getItems().add(viewmenu2); 
        menu3.getItems().add(viewmenu3); 
        menu3.getItems().add(viewmenu4);
        
        menu4.getItems().add(navigatemenu1); 
        menu4.getItems().add(navigatemenu2);
        
        menu5.getItems().add(sourcemenu1);
        
        menu6.getItems().add(refactormenu1); 
        menu6.getItems().add(refactormenu2); 
        menu6.getItems().add(refactormenu3); 
        menu6.getItems().add(refactormenu4);
        
        menu7.getItems().add(runmenu1); 
        menu7.getItems().add(runmenu2);
        
        menu8.getItems().add(debugmenu1); 
        menu8.getItems().add(debugmenu2);
        
        //Event handling
        // label to display events 
        Label l = new Label("\t\t\t\tNo menu item selected");
        
        BorderPane layout = new BorderPane();
  
        // create events for menu items 
        // action event 
 
        
         EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                /*l.setText("\t\t\t\t" + ((MenuItem)e.getSource()).getText() +  
                                                               " selected");*/
                new Thread(new Runnable() {
          @Override
          public void run() {
              try {
                  while (true) {
                      
                      if (l.getText().trim().length() == 0)
                      {
                          
                          text="\t\t\t\t" + ((MenuItem)e.getSource()).getText() +" selected";
                      }
                          
                      else
                          text="";
                      
                      Platform.runLater(new Runnable() { // Run from JavaFX GUI
                          @Override
                          public void run() {
                              l.setText(text);
                          }
                      });

                      Thread.sleep(200);
                  }
              }
              catch (InterruptedException ex) {  
              }
          }
      }).start();
                
            } 
        }; 
        
         //filemenu1.setOnAction(event);
         filemenu2.setOnAction(event);
         filemenu3.setOnAction(event);
        
         editmenu1.setOnAction(event);
         editmenu2.setOnAction(event);
         
         viewmenu1.setOnAction(event);
         viewmenu2.setOnAction(event);
         viewmenu3.setOnAction(event);
         viewmenu4.setOnAction(event);
         
         navigatemenu1.setOnAction(event);
         navigatemenu2.setOnAction(event);
         
         sourcemenu1.setOnAction(event);
         
         refactormenu1.setOnAction(event);
         refactormenu2.setOnAction(event);
         refactormenu3.setOnAction(event);
         refactormenu4.setOnAction(event);
         
         runmenu1.setOnAction(event);
         runmenu2.setOnAction(event);
         
         debugmenu1.setOnAction(event);
         debugmenu2.setOnAction(event);
         
         menu9.setOnAction(event);
         
         
         
         filemenu1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                layout.setCenter(pieChart);
                
            }
        });
  
        // add event 
        /*m2.setOnAction(event); 
        m3.setOnAction(event); */
      
        // create a menubar 
        MenuBar mb = new MenuBar(); 
  
        // add menu to menubar 
        mb.getMenus().add(menu1); 
        mb.getMenus().add(menu2);
        mb.getMenus().add(menu3); 
        mb.getMenus().add(menu4);
        mb.getMenus().add(menu5); 
        mb.getMenus().add(menu6);
        mb.getMenus().add(menu7); 
        mb.getMenus().add(menu8);
        mb.getMenus().add(menu9); 
        mb.getMenus().add(menu10);
  
        
        
        // create a VBox 
        VBox vb = new VBox(mb,l,layout); 
        
        // create a scene 
        Scene sc = new Scene(vb, 600, 400); 
  
        // set the scene 
        primaryStage.setScene(sc); 
  
        primaryStage.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
