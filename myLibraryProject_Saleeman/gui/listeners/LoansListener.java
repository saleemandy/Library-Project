/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.listeners;

import java.util.List;
import myLibraryProject.Loan;


public interface LoansListener {
    public void onLoanCreated(Loan loan);
    public void onLoanReturned(Loan loan);
    public List<Loan> getLoans();
}
