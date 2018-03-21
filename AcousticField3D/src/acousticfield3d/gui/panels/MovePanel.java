/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acousticfield3d.gui.panels;

import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.MeshEntity;
import acousticfield3d.scene.Scene;
import acousticfield3d.simulation.AnimKeyFrame;
import acousticfield3d.utils.Parse;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;

/**
 *
 * @author Asier
 */
public class MovePanel extends javax.swing.JPanel {
    final MainForm mf;
    final ArrayList<Vector3f> snapBeadPositions = new ArrayList<>();
    final HashMap<Integer, ArrayList<Entity>> selections = new HashMap<>();
    
    public MovePanel(MainForm mf) {
        this.mf = mf;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lateralTrapGroup = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        beadNSpinner = new javax.swing.JSpinner();
        autoCalcCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        speedText = new javax.swing.JTextField();
        leftButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        backwardsButton = new javax.swing.JButton();
        autoSendCheck = new javax.swing.JCheckBox();
        resetButton = new javax.swing.JButton();
        snapButton = new javax.swing.JButton();
        autoAddCheck = new javax.swing.JCheckBox();
        moveAllCheck = new javax.swing.JCheckBox();
        neutralButton = new javax.swing.JButton();
        useAlgCheck = new javax.swing.JCheckBox();
        rXPButton = new javax.swing.JButton();
        rYPButton = new javax.swing.JButton();
        rZPButton = new javax.swing.JButton();
        rZNButton = new javax.swing.JButton();
        rYNButton = new javax.swing.JButton();
        rXNButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        angleText = new javax.swing.JTextField();
        interpButton = new javax.swing.JButton();
        stepSizeText = new javax.swing.JTextField();
        gatherButton = new javax.swing.JButton();
        expandButton = new javax.swing.JButton();

        jLabel2.setText("N:");

        beadNSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        autoCalcCheck.setSelected(true);
        autoCalcCheck.setText("calc");

        jLabel3.setText("Length:");

        speedText.setText("0.001");

        leftButton.setText("L");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        upButton.setText("U");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        rightButton.setText("R");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        downButton.setText("D");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        forwardButton.setText("F");
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });

        backwardsButton.setText("B");
        backwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardsButtonActionPerformed(evt);
            }
        });

        autoSendCheck.setSelected(true);
        autoSendCheck.setText("send");

        resetButton.setText("R");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        snapButton.setText("S");
        snapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapButtonActionPerformed(evt);
            }
        });

        autoAddCheck.setText("genAnim");

        moveAllCheck.setText("Move All");

        neutralButton.setText("0");
        neutralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutralButtonActionPerformed(evt);
            }
        });

        useAlgCheck.setText("useAlg");

        rXPButton.setText("Rx+");
        rXPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rXPButtonActionPerformed(evt);
            }
        });

        rYPButton.setText("Ry+");
        rYPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rYPButtonActionPerformed(evt);
            }
        });

        rZPButton.setText("Rz+");
        rZPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZPButtonActionPerformed(evt);
            }
        });

        rZNButton.setText("Rz-");
        rZNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZNButtonActionPerformed(evt);
            }
        });

        rYNButton.setText("Ry-");
        rYNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rYNButtonActionPerformed(evt);
            }
        });

        rXNButton.setText("Rx-");
        rXNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rXNButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("angle:");

        angleText.setText("1");

        interpButton.setText("Interp");
        interpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interpButtonActionPerformed(evt);
            }
        });

        stepSizeText.setText("0.0005");

        gatherButton.setText(">");
        gatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatherButtonActionPerformed(evt);
            }
        });

        expandButton.setText("<");
        expandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(neutralButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gatherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(upButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(downButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(expandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(forwardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4))
                                    .addComponent(backwardsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(snapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beadNSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(autoCalcCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autoSendCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(autoAddCheck)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speedText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(moveAllCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(useAlgCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rXNButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rXPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rYNButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rYPButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rZPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rZNButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(angleText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(interpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stepSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(beadNSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoCalcCheck)
                    .addComponent(autoSendCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoAddCheck)
                    .addComponent(jLabel3)
                    .addComponent(speedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftButton)
                    .addComponent(upButton)
                    .addComponent(rightButton)
                    .addComponent(forwardButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downButton)
                    .addComponent(backwardsButton)
                    .addComponent(gatherButton)
                    .addComponent(expandButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(snapButton)
                    .addComponent(neutralButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(angleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rXPButton)
                    .addComponent(rYPButton)
                    .addComponent(rZPButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rXNButton)
                    .addComponent(rYNButton)
                    .addComponent(rZNButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveAllCheck)
                    .addComponent(useAlgCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interpButton)
                    .addComponent(stepSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Entity> getSelection(final int n){
        return selections.get(n);
    }
            
    public void snapSelection(final int n){
        final ArrayList<Entity> sel = new ArrayList<>( mf.selection );
        selections.put(n, sel);
    }
    
    public void applySelection(final int n){
        final ArrayList<Entity> sel = selections.get(n);
        mf.setSelection( sel );
        mf.needUpdate();
    }
    
    public void doAutoCalcAndSend(){
        final boolean autoCalc = autoCalcCheck.isSelected();
        final boolean autoAddKeyFrame = autoAddCheck.isSelected();
        final boolean autoSend = autoSendCheck.isSelected();
        
        if (autoCalc) {
            if (! useAlgCheck.isSelected()){
                Entity e = getBeadEntity();
                if (e != null){
                    final Vector3f pos = e.getTransform().getTranslation();
                    mf.trapsPanel.applyOnTarget(pos);
                }
            }else{
                mf.algForm.runBFGS(false, false, true);
            }
        }
        
        if( autoAddKeyFrame ){
            // add the key frame
            mf.animPanel.addKeyFrame();
        }
        
        if (autoSend) {
            mf.transControlPanel.sendPattern();
        }
    }
    
    public Entity getBeadEntity(){
        final int n = (Integer)beadNSpinner.getValue();
        
        //check bead number n in selection
        final ArrayList<Entity> sel = mf.selection;
        if (n < 0 || n >= sel.size()){
            return null;
        }        
        return sel.get( n );
    }
    
    public void applyVector(float x, float y, float z){
        final Entity e = getBeadEntity();
        if (e == null){ return;}
        
        final Vector3f t = new Vector3f(x, y, z);
        t.multLocal( getSpeed() );
        
        if (moveAllCheck.isSelected()){
            final ArrayList<Entity> sel = mf.getSelection();
            for (Entity ent : sel) {
                ent.getTransform().getTranslation().addLocal(t);
            }
        }else{
            e.getTransform().getTranslation().addLocal(t);
        }
        
        mf.transformToGUI( e.getTransform() );
        doAutoCalcAndSend();
        mf.needUpdate();
    }

    public void applyRotation(float rx,  float ry,  float rz){
        final Entity e = getBeadEntity();
        if (e == null || mf.selection.isEmpty() ){ return;}
        
        final float angles = Parse.toFloat( angleText.getText() );
        rx *= M.DEG_TO_RAD * angles;
        ry *= M.DEG_TO_RAD * angles;
        rz *= M.DEG_TO_RAD * angles;
        
        //get selection center
        final Vector3f selectionCenter = Scene.calcCenter( mf.selection );
        
        if (moveAllCheck.isSelected()){
            final ArrayList<Entity> sel = mf.getSelection();
            for (Entity ent : sel) {
                ent.rotateAround(selectionCenter, rx, ry, rz);
            }
        }else{
            e.rotateAround(selectionCenter, rx, ry, rz);
        }
        
        mf.transformToGUI( e.getTransform() );
        doAutoCalcAndSend();
        mf.needUpdate();
    }
    
   public void applyScale(final float scale){
        final Entity e = getBeadEntity();
        if (e == null || mf.selection.isEmpty() ){ return;}
        
        final float stepSize = scale * Parse.toFloat( speedText.getText() );
        final Vector3f sCenter = Scene.calcCenter( mf.selection );
        
        if (moveAllCheck.isSelected()){
            final ArrayList<Entity> sel = mf.getSelection();
            for (Entity ent : sel) {
                final Vector3f pos = ent.getTransform().getTranslation();
                sCenter.y = pos.y;
                pos.moveTowards(sCenter, stepSize);
            }
        }else{
            final Vector3f pos = e.getTransform().getTranslation();
            sCenter.y = pos.y;
            pos.moveTowards(sCenter, stepSize);
        }
        
        mf.transformToGUI( e.getTransform() );
        doAutoCalcAndSend();
        mf.needUpdate();
    }
    
    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        applyVector(-1,0,0);
    }//GEN-LAST:event_leftButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
         applyVector(0,1,0);
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        applyVector(0,-1,0);
    }//GEN-LAST:event_downButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        applyVector(1,0,0);
    }//GEN-LAST:event_rightButtonActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        applyVector(0,0,-1);
    }//GEN-LAST:event_forwardButtonActionPerformed

    private void backwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardsButtonActionPerformed
        applyVector(0,0,1);
    }//GEN-LAST:event_backwardsButtonActionPerformed

 
    public float getSpeed(){
        return Parse.toFloat( speedText.getText() );    
    }

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       resetParticlePos();
    }//GEN-LAST:event_resetButtonActionPerformed

    public void resetParticlePos(){
        final ArrayList<Entity> sel = mf.selection;
        final int n = M.min(sel.size(), snapBeadPositions.size());
        for (int i = 0; i < n; ++i){
            sel.get(i).getTransform().getTranslation().set( snapBeadPositions.get(i) );
        }

        
        applyVector(0,0,0);
    }
    
    public void selectFirstBead() {
        Entity e = mf.scene.getFirstWithTag( Entity.TAG_CONTROL_POINT );
        if (e == null){ return;}
        mf.clearSelection();
        mf.getSelection().add( e );
        e.selected = true;
    }
    
    private void snapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snapButtonActionPerformed
        snapBeadPositions();
    }//GEN-LAST:event_snapButtonActionPerformed

    private void neutralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutralButtonActionPerformed
        applyVector(0, 0, 0);
    }//GEN-LAST:event_neutralButtonActionPerformed

    private void rYNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rYNButtonActionPerformed
        applyRotation(0, -1, 0);
    }//GEN-LAST:event_rYNButtonActionPerformed

    private void rXPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rXPButtonActionPerformed
        applyRotation(1, 0, 0);
    }//GEN-LAST:event_rXPButtonActionPerformed

    private void rXNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rXNButtonActionPerformed
        applyRotation(-1, 0, 0);
    }//GEN-LAST:event_rXNButtonActionPerformed

    private void rYPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rYPButtonActionPerformed
        applyRotation(0, 1, 0);
    }//GEN-LAST:event_rYPButtonActionPerformed

    private void rZPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZPButtonActionPerformed
        applyRotation(0, 0, 1);
    }//GEN-LAST:event_rZPButtonActionPerformed

    private void rZNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZNButtonActionPerformed
        applyRotation(0, 0, -1);
    }//GEN-LAST:event_rZNButtonActionPerformed

    
    
    private void interpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interpButtonActionPerformed
        final float stepSize = Parse.toFloat( stepSizeText.getText() );
        final AnimKeyFrame lastKey = mf.animPanel.currentAnimation.lastKeyFrame();
        final ArrayList<MeshEntity> points = mf.simulation.controlPoints;
                
        final HashMap<Entity, Vector3f> targetPositions = new HashMap<>( points.size() );
        for (Entity e : points){
            final Vector3f pos = e.getTransform().getTranslation();
            targetPositions.put(e, pos.clone() );
            final Vector3f sPos = lastKey.getPointsPositions().get( e );
            if (sPos != null){
                pos.set(sPos);
            }
        }
            
        //while all the particles have not reached their destination
        boolean allParticlesReached = false;
        final Vector3f diffPos = new Vector3f();
        while( ! allParticlesReached ){
            allParticlesReached = true;
            for ( Entity e : points){
                final Vector3f cPos = e.getTransform().getTranslation();
                final Vector3f tPos = targetPositions.get(e);
                if (tPos != null){
                    diffPos.set(tPos).subtractLocal(cPos);
                    final float distance = diffPos.length();
                    if (distance > M.FLT_EPSILON){
                        allParticlesReached = false;
                        diffPos.multLocal( M.min(distance, stepSize) ).divideLocal( distance );
                        cPos.addLocal( diffPos );
                    }
                }
            }
            mf.algForm.runBFGS(false, false, true);
            mf.animPanel.addKeyFrame();
        }
 
    }//GEN-LAST:event_interpButtonActionPerformed

    private void gatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatherButtonActionPerformed
        applyScale( 1 );
    }//GEN-LAST:event_gatherButtonActionPerformed

    private void expandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expandButtonActionPerformed
        applyScale( -1 );
    }//GEN-LAST:event_expandButtonActionPerformed


    public void snapBeadPositions(){
        snapBeadPositions.clear();
        for ( Entity e : mf.selection){
            snapBeadPositions.add( e.getTransform().getTranslation().clone() ); 
        }
    }
    

    public void incBeadSelNumber(final int amount){
        beadNSpinner.setValue( ((Integer)beadNSpinner.getValue()) + amount );
    }
  
    public JButton getNeutralButton() {
        return neutralButton;
    }

    public JButton getUpButton() {
        return upButton;
    }

    public JButton getDownButton() {
        return downButton;
    }
    
    public void setGenerateKeyFrame(final boolean enabled){
        autoAddCheck.setSelected(enabled);
    }
    
    public void setCalculate(final boolean enabled){
        autoCalcCheck.setSelected(enabled);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angleText;
    private javax.swing.JCheckBox autoAddCheck;
    private javax.swing.JCheckBox autoCalcCheck;
    private javax.swing.JCheckBox autoSendCheck;
    private javax.swing.JButton backwardsButton;
    private javax.swing.JSpinner beadNSpinner;
    private javax.swing.JButton downButton;
    private javax.swing.JButton expandButton;
    private javax.swing.JButton forwardButton;
    private javax.swing.JButton gatherButton;
    private javax.swing.JButton interpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.ButtonGroup lateralTrapGroup;
    private javax.swing.JButton leftButton;
    private javax.swing.JCheckBox moveAllCheck;
    private javax.swing.JButton neutralButton;
    private javax.swing.JButton rXNButton;
    private javax.swing.JButton rXPButton;
    private javax.swing.JButton rYNButton;
    private javax.swing.JButton rYPButton;
    private javax.swing.JButton rZNButton;
    private javax.swing.JButton rZPButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton snapButton;
    private javax.swing.JTextField speedText;
    private javax.swing.JTextField stepSizeText;
    private javax.swing.JButton upButton;
    private javax.swing.JCheckBox useAlgCheck;
    // End of variables declaration//GEN-END:variables

    

}
