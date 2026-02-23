/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

/**
 *
 * @author jeng
 */
public class Player {
    private String name;
    private String team;
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public void setName(String n) {
        name = n;
    }
    public void setTeam(String t) {
        team = t;
    }
    public boolean isSameTeam(Player p) {
        return team.equals(p.team);
    }
}
