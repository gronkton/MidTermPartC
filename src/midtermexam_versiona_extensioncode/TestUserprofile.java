/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author graha
 */
import java.util.Scanner;
public class TestUserprofile{
    
    
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
        String uid;
            String genre;
                String[] profile = UserProfile.genres;
                System.out.println("ENTER USER ID");
                uid = scan.nextLine();
                System.out.print("ENTER GENRE");
                genre = scan.nextLine();
                
                for(int i=0; i< profile.length; i++){
                    if(genre.equals(profile[i]))
                        
                    UserProfile obj = new UserProfile(uid,genre);
                    System.out.println("YOUR PROFILE "+obj.getUserID()+" "+obj.getGenre());
                }
              }
            }
