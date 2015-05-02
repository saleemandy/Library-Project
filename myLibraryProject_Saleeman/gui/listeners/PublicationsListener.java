/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.listeners;

import java.util.List;
import myLibraryProject.Publication;

public interface PublicationsListener {
    public void onPublicationCreated(Publication publication);
    
    public List<Publication> getPublications();
}
