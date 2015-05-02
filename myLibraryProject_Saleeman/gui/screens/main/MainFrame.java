/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.screens.main;

import gui.listeners.AuthorsListener;
import gui.listeners.LoansListener;
import gui.listeners.MembersListener;
import gui.listeners.PublicationsListener;
import gui.listeners.ReservationsListener;
import gui.screens.authors.AuthorsFrame;
import gui.screens.members.MemberLoansFrame;
import gui.screens.members.MemberReservationsFrame;
import gui.screens.members.MembersFrame;
import gui.screens.publications.PublicationsFrame;
import java.util.ArrayList;
import java.util.List;
import myLibraryProject.Address;
import myLibraryProject.Author;
import myLibraryProject.Book;
import myLibraryProject.Loan;
import myLibraryProject.Member;
import myLibraryProject.Publication;
import myLibraryProject.Reservation;

public class MainFrame extends javax.swing.JFrame implements PublicationsListener, MembersListener, AuthorsListener, LoansListener, ReservationsListener {

    private final List<Publication> publications;
    private final List<Member> members;
    private final List<Author> authors;
    private final List<Loan> loans;
    private final List<Reservation> reservations;
    private PublicationsFrame publicationsFrame;
    private MembersFrame membersFrame;
    private AuthorsFrame authorsFrame;
    private MemberLoansFrame loansFrame;
    private MemberReservationsFrame reservationsFrame;
    
    /**
     * Creates new form Main
     */
    public MainFrame() {
        initComponents();
        setResizable(false);
        publications = new ArrayList<>();
        members = new ArrayList<>();
        authors = new ArrayList<>();
        loans = new ArrayList<>();
        reservations = new ArrayList<>();
        fillTestData();
    }

    private void fillTestData() {
        Member m = new Member(124, "Saleeman", "doyin", "641-8146034", null);
        m.setAddress(new Address("4th street", "FairField", "Iowa", "", m));
        members.add(m);
        m = new Member(15, "Elena", "Klinshpont", "2378374", null);
        m.setAddress(new Address("", "", "", "", m));
        members.add(m);
        m = new Member(25, "San", "Tourani", "237495634", null);
        m.setAddress(new Address("", "", "", "", m));
        members.add(m);
        m = new Member(54, "Ronaldo", "Cristiano", "54834955374", null);
        m.setAddress(new Address("", "", "", "", m));
        members.add(m);
        m = new Member(34, "Wizzy", "Meekmill", "2374928374", null);
        m.setAddress(new Address("", "", "", "", m));
        members.add(m);

        Author a = new Author("credentials", "bio", "AUTHOR", "AUTHOR", "PHONE", null);
        a.setAddress(new Address("", "", "", "", a));
        authors.add(a);

        a = new Author("credentials", "bio", "AUTHOR", "AUTHOR", "PHONE", null);
        a.setAddress(new Address("", "", "", "", a));
        authors.add(a);

        a = new Author("credentials", "bio", "AUTHOR", "AUTHOR", "PHONE", null);
        a.setAddress(new Address("", "", "", "", a));
        authors.add(a);

        Book b = new Book("237534234", "BOOK1");
        for (int i = 0; i < 10; i++) {
            b.addCopy();
        }
        b.getAuthors().add(a);
        a.getBooks().add(b);

        publications.add(b);

        b = new Book("BOOK2", "3423");
        b.addCopy();
        b.addCopy();
        b.getAuthors().add(authors.get(0));
        b.getAuthors().add(authors.get(1));
        getAuthors().get(0).getBooks().add(b);
        getAuthors().get(1).getBooks().add(b);
        publications.add(b);

        b = new Book("BOOK3", "532753");
        b.addCopy();
        b.addCopy();
        b.getAuthors().add(authors.get(0));
        getAuthors().get(0).getBooks().add(b);

        publications.add(b);
        b = new Book("BOOK4", "5384462");
        b.addCopy();
        b.addCopy();
        b.addCopy();

        b.getAuthors().add(authors.get(1));
        getAuthors().get(1).getBooks().add(b);

        publications.add(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold default-state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        publicationsButton = new javax.swing.JButton();
        membersButton = new javax.swing.JButton();
        authorsButton = new javax.swing.JButton();
        loansButton = new javax.swing.JButton();
        reservationsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        publicationsButton.setText("Publications");
        publicationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicationsButtonActionPerformed(evt);
            }
        });

        membersButton.setText("Members");
        membersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersButtonActionPerformed(evt);
            }
        });

        authorsButton.setText("Authors");
        authorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorsButtonActionPerformed(evt);
            }
        });

        loansButton.setText("Loans");
        loansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansButtonActionPerformed(evt);
            }
        });

        reservationsButton.setText("Reservations");
        reservationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(publicationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(membersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(authorsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reservationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(loansButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(publicationsButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(membersButton)
                    .addComponent(reservationsButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loansButton)
                    .addComponent(authorsButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publicationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicationsButtonActionPerformed
        publicationsFrame = new PublicationsFrame(this, authors);

        publicationsFrame.setVisible(true);
    }//GEN-LAST:event_publicationsButtonActionPerformed

    private void membersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersButtonActionPerformed
        membersFrame = new MembersFrame(this, this,this, publications);

        membersFrame.setVisible(true);
    }//GEN-LAST:event_membersButtonActionPerformed

    private void authorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorsButtonActionPerformed
        authorsFrame = new AuthorsFrame(this);

        authorsFrame.setVisible(true);
    }//GEN-LAST:event_authorsButtonActionPerformed

    private void loansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansButtonActionPerformed

        loansFrame = new MemberLoansFrame(this, publications, null);

        loansFrame.setVisible(true);
    }//GEN-LAST:event_loansButtonActionPerformed

    private void reservationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationsButtonActionPerformed
        reservationsFrame = new MemberReservationsFrame(this, null);

        reservationsFrame.setVisible(true);
    }//GEN-LAST:event_reservationsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame m = new MainFrame();
                m.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorsButton;
    private javax.swing.JButton loansButton;
    private javax.swing.JButton membersButton;
    private javax.swing.JButton publicationsButton;
    private javax.swing.JButton reservationsButton;
    // End of variables declaration//GEN-END:variables

    void setParameter(int i) {
        System.out.println(i);
    }

    @Override
    public void onPublicationCreated(Publication publication) {
        publications.add(publication);
    }

    @Override
    public List<Publication> getPublications() {
        return publications;
    }

    @Override
    public void onMemberCreated(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }

    @Override
    public void onAuthorCreated(Author author) {
        authors.add(author);
    }

    @Override
    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public void onLoanCreated(Loan loan) {
        loans.add(loan);
    }

    @Override
    public void onLoanReturned(Loan loan) {
        loans.remove(loan);
    }

    @Override
    public List<Loan> getLoans() {
        return loans;
    }

    @Override
    public void onReservationCreated(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public void onReservationCancelled(Reservation reservation) {
        reservations.remove(reservation);
    }

    @Override
    public void onReservationPickedUp(Reservation reservation) {
        reservations.remove(reservation);
    }

    @Override
    public List<Reservation> getReservations() {
        return reservations;
    }

}
