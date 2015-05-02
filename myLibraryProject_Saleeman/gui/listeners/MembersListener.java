/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.listeners;

import java.util.List;
import myLibraryProject.Member;

public interface MembersListener {
    public void onMemberCreated(Member member);
    
    public List<Member> getMembers();
}
