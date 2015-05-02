/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.listeners;

import java.util.List;
import myLibraryProject.Author;

public interface AuthorsListener {
    public void onAuthorCreated(Author author );
    public List<Author> getAuthors();
}
