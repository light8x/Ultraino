/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d.gui;

import acousticfield3d.math.M;
import acousticfield3d.math.Vector2f;
import acousticfield3d.scene.Entity;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.Parse;
import acousticfield3d.utils.TextFrame;
import acousticfield3d.utils.uartComm.SerialComms;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author am14010
 */
public class AssignTransducers extends javax.swing.JFrame implements SerialComms.Listener{
    public static final int nSamples = 32;
    public static final int MILLI_WAIT_FOR_DRIVER = 5;
    
    final MainForm mf;
    SerialComms serial;
    boolean samplesRead = false;
    ByteArrayOutputStream buffer = new ByteArrayOutputStream(nSamples * 2);
    float[] samples = new float[nSamples];
    final HashMap<Integer, Integer> assignedPins = new HashMap<>();
    
    public AssignTransducers(MainForm mf) {
        this.mf = mf;
        initComponents();
        
        //DefaultCaret caret = (DefaultCaret)area.getCaret();
        //caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transNumberText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        speedText = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        disconnectButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        phaseCorrectionCheck = new javax.swing.JCheckBox();
        erasePhaseCorrectionButton = new javax.swing.JButton();
        autoAssignCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        selectTransText = new javax.swing.JTextField();
        targetTransText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amplitudeText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phaseText = new javax.swing.JTextField();
        minAmpCheck = new javax.swing.JCheckBox();
        minAmpText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        maxTransText = new javax.swing.JTextField();
        maxAmpCheck = new javax.swing.JCheckBox();
        maxAmpText = new javax.swing.JTextField();
        onlyPolCheck = new javax.swing.JCheckBox();
        phaseRefText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phaseCorrectionLabel = new javax.swing.JLabel();
        setPhaseCorButton = new javax.swing.JButton();
        seePhaseCorButton = new javax.swing.JButton();
        checkButton1 = new javax.swing.JButton();
        exportPhaseCorrButton = new javax.swing.JButton();
        exportDivsText = new javax.swing.JTextField();

        jLabel2.setText("Trans number:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Transducer Assignment");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Speed:");

        speedText.setText("1000000");

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        disconnectButton.setText("Disconnect");
        disconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        phaseCorrectionCheck.setText("phaseCorr");

        erasePhaseCorrectionButton.setText("Res");
        erasePhaseCorrectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erasePhaseCorrectionButtonActionPerformed(evt);
            }
        });

        autoAssignCheck.setSelected(true);
        autoAssignCheck.setText("autoassign");

        jLabel3.setText("Selected:");

        jLabel4.setText("Pin:");

        jLabel5.setText("Amplitude");

        jLabel6.setText("Phase");

        minAmpCheck.setSelected(true);
        minAmpCheck.setText("minAmp");

        minAmpText.setText("775");

        jLabel7.setText("Max trans:");

        maxTransText.setText("64");

        maxAmpCheck.setSelected(true);
        maxAmpCheck.setText("maxAmp");

        maxAmpText.setText("820");

        onlyPolCheck.setText("OnlyPolarity");

        phaseRefText.setText("0");

        jLabel8.setText("ref");

        phaseCorrectionLabel.setText("phase");

        setPhaseCorButton.setText("Set");
        setPhaseCorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPhaseCorButtonActionPerformed(evt);
            }
        });

        seePhaseCorButton.setText("See");
        seePhaseCorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seePhaseCorButtonActionPerformed(evt);
            }
        });

        checkButton1.setText("Phase");
        checkButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButton1ActionPerformed(evt);
            }
        });

        exportPhaseCorrButton.setText("export");
        exportPhaseCorrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPhaseCorrButtonActionPerformed(evt);
            }
        });

        exportDivsText.setText("32");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speedText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(connectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disconnectButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxTransText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectTransText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(targetTransText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amplitudeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phaseText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phaseCorrectionCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onlyPolCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phaseRefText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phaseCorrectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(erasePhaseCorrectionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setPhaseCorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seePhaseCorButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finishButton)
                        .addGap(10, 10, 10)
                        .addComponent(prevButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportDivsText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportPhaseCorrButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkButton)
                        .addGap(18, 18, 18)
                        .addComponent(autoAssignCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minAmpCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minAmpText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxAmpCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxAmpText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(speedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connectButton)
                    .addComponent(disconnectButton)
                    .addComponent(jLabel7)
                    .addComponent(maxTransText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(erasePhaseCorrectionButton)
                            .addComponent(phaseCorrectionCheck)
                            .addComponent(onlyPolCheck)
                            .addComponent(phaseRefText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phaseCorrectionLabel)
                            .addComponent(setPhaseCorButton)
                            .addComponent(seePhaseCorButton))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(finishButton)
                    .addComponent(prevButton)
                    .addComponent(nextButton)
                    .addComponent(exportPhaseCorrButton)
                    .addComponent(exportDivsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selectTransText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(targetTransText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(amplitudeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(phaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maxAmpCheck)
                        .addComponent(maxAmpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkButton)
                        .addComponent(autoAssignCheck)
                        .addComponent(minAmpCheck)
                        .addComponent(minAmpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeSerial(){
        if(serial != null){
            serial.disconnect();
            serial = null;
        }
    }
    
    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        closeSerial();
        serial = new SerialComms(-1, Parse.toInt(speedText.getText()), this);
    }//GEN-LAST:event_connectButtonActionPerformed

    private void disconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectButtonActionPerformed
        closeSerial();
    }//GEN-LAST:event_disconnectButtonActionPerformed

    private void setAmplitude(final int number,final float target, final float others){
        final List<Transducer> trans = mf.simulation.getTransducers();
        final int n = trans.size();
        for(int i = 0; i < n; ++i){
            trans.get(i).setpAmplitude( number == i ? target : others);
        }
    }
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        assignedPins.clear();
        
        //they are all unassigned and unselected
        setAmplitude(-1, 0, 0);
        mf.clearSelection();
        
        //select the first one
        mf.setSelection( mf.simulation.getTransducers().get(0));
        
        mf.needUpdate();
    }//GEN-LAST:event_startButtonActionPerformed

    
    
    private void takeSamples() throws InterruptedException{
        samplesRead = false;
        buffer.reset();
        serial.writeByte('r');
        serial.flush();
        while(!samplesRead){ Thread.sleep( 1 ); } //cant be bothered with wait and notify
        final byte[] array = buffer.toByteArray();
        for(int i = 0; i < nSamples; ++i){
            samples[i] = (  ((array[i*2 + 0]&0xFF)<<8) | (array[i*2 + 1]&0xFF) );
        }
    }
    
    public static Vector2f extractAmpAndPhase(final float[] samples){
        final int n = samples.length;
        final List<Integer> peaks = new ArrayList<>();
        final List<Float> peaksCorrected = new ArrayList<>();
        
        //print the samples
        /*
        System.out.println("Samples are:");
        for(int i = 0; i < n; ++i){
            System.out.println(samples[i]);
        }*/
        
        for(int i = 1; i < n-1; ++i){
            final float a = samples[i-1];
            final float b = samples[i];
            final float c = samples[i+1];
            if ((a <= b && b >= c) && (a != b || b != c)){ //peak
                peaks.add(i);
                peaksCorrected.add( i + (c-a)/(a+b+c)); //Centre of mass
                ++i;
            }
        }
        
   
        /*
        System.out.println("Peaks are at :");
        for(Float f : peaksCorrected){
            System.out.println(f);
        }*/
        
        //get period
        final int nPeaks = peaks.size();
        if (nPeaks < 2){
            return new Vector2f(-1 , 0);
        }
        float period = 0;
        for(int i = 1; i < nPeaks;++i){
            period += peaksCorrected.get(i) - peaksCorrected.get(i-1);
        }
        period /= (nPeaks-1);
        
        //System.out.println("Phases:");
        
        //get amplitude and phase
        float amplitude = 0;
        final Vector2f phaseV = new Vector2f();
        for(int i = 0; i < nPeaks;++i){
            final int peakPos = peaks.get(i);
            amplitude += samples[ peakPos ];
            final float phase = (peaksCorrected.get(i) % period) * M.TWO_PI / period;
            phaseV.addLocal( M.cos(phase), M.sin(phase));
            
            //System.out.println( peaksCorrected.get(i) % period / period);
        }
        amplitude /= nPeaks;
        
        return new Vector2f(amplitude, phaseV.getAngle());
    }
    
    
    private void doCheck() throws InterruptedException{
        final float maxAmpTr = Parse.toFloat( maxAmpText.getText() );
        final boolean maxAmpSelected = maxAmpCheck.isSelected();
        final float phaseRef = Parse.toFloat( phaseRefText.getText() );
                
        //get selected transducer
        Transducer t = null;
        for(Entity e : mf.selection){
            if (e instanceof Transducer){
                t = (Transducer)e;
                break;
            }
        }
        if(t == null){ return; }
        
        //create the fake transducer sets for sweeping
        final int nTrans = Parse.toInt( maxTransText.getText() );
        final List<Transducer> fakeTransducers = new ArrayList<>( nTrans );
        for (int i = 0; i < nTrans; ++i){
            Transducer tf = new Transducer();
            tf.setFrequency( t.getFrequency());
            tf.setpAmplitude( 0.0f );
            tf.setPhase( 0.0f );
            tf.setDriverPinNumber( i );
            fakeTransducers.add(tf);
        }
        
        
        float maxAmp = -1; int pin = -1; float phase = 0;
        int startingPin = Parse.toInt( targetTransText.getText() ) - 1;
        startingPin = M.iclamp(startingPin, 0, nTrans-1);
        for(int j = 0; j < nTrans; ++j){ //iterate over the transducers
            int i = (startingPin + j) % nTrans;
            if (assignedPins.containsKey(i) ){
                continue;
            }
            
            fakeTransducers.get(i).setAmplitude(1);
            mf.transControlPanel.sendPattern( fakeTransducers );
            fakeTransducers.get(i).setAmplitude(0);
            
            Thread.sleep(MILLI_WAIT_FOR_DRIVER );
            takeSamples();
            
            Vector2f ampAndPhase = extractAmpAndPhase(samples);
            if (ampAndPhase.x > maxAmp){
                maxAmp = ampAndPhase.x;
                phase = ampAndPhase.y / M.PI;
                pin = i;
                if (maxAmp > maxAmpTr && maxAmpSelected){
                    break;
                }
            }    
        }
        
        //put data into the text
        selectTransText.setText( t.getOrderNumber() + "");
        targetTransText.setText( pin + "");
        amplitudeText.setText( maxAmp + "");
        phaseText.setText( phase + "");
        
        //thresold checking
        boolean minAmpReached = true;
        if (minAmpCheck.isSelected()){
            if (maxAmp < Parse.toFloat( minAmpText.getText() )){
                minAmpReached = false;
                amplitudeText.setText( "!!!!!!");
            }
        }
        
        //assigning
        if (autoAssignCheck.isSelected() && minAmpReached){
            //assign pin
            t.setDriverPinNumber(pin);
            assignedPins.put(pin, pin);
            
            //phase correction?
            if (phaseCorrectionCheck.isSelected()){
                if (onlyPolCheck.isSelected()){
                    final float angleDiff = M.angleDiff(phase * M.PI, phaseRef * M.PI);
                    //System.out.println(angleDiff);
                    t.setPhaseCorrection( (angleDiff < M.PI/2) ? 0 : 1);
                }else{
                    t.setPhaseCorrection( -phase );
                }
                phaseCorrectionLabel.setText(t.getPhaseCorrection() + "");
            }else{
                phaseCorrectionLabel.setText("");
            }
            
            t.setpAmplitude(1);
            
            //next one
            nextButtonActionPerformed(null);
        }
    }
    
    private void doCheckOnlyPhase() throws InterruptedException{
       final float phaseRef = Parse.toFloat( phaseRefText.getText() );
       final boolean maxAmpSelected = maxAmpCheck.isSelected();
                
        //get selected transducer
        Transducer t = null;
        for(Entity e : mf.selection){
            if (e instanceof Transducer){
                t = (Transducer)e;
                break;
            }
        }
        if(t == null){ return; }
        
       takeSamples();
       Vector2f ampAndPhase = extractAmpAndPhase(samples);
      final float maxAmp = ampAndPhase.x;
       final float         phase = ampAndPhase.y / M.PI;
     
        //put data into the text
        selectTransText.setText( t.getOrderNumber() + "");
        amplitudeText.setText( maxAmp + "");
        phaseText.setText( phase + "");
        
        //thresold checking
        boolean minAmpReached = true;
        if (minAmpCheck.isSelected()){
            if (maxAmp < Parse.toFloat( minAmpText.getText() )){
                minAmpReached = false;
                amplitudeText.setText( "!!!!!!");
            }
        }
        
        //assigning
        if (autoAssignCheck.isSelected() && minAmpReached){
           //phase correction?
            if (phaseCorrectionCheck.isSelected()){
                if (onlyPolCheck.isSelected()){
                    final float angleDiff = M.angleDiff(phase * M.PI, phaseRef * M.PI);
                    //System.out.println(angleDiff);
                    t.setPhaseCorrection( (angleDiff < M.PI/2) ? 0 : 1);
                }else{
                    t.setPhaseCorrection( -phase );
                }
                phaseCorrectionLabel.setText(t.getPhaseCorrection() + "");
            }else{
                phaseCorrectionLabel.setText("");
            }
            
            t.setpAmplitude(1);
            
            //next one
            nextButtonActionPerformed(null);
        }
    }
    
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        try {
            
            doCheck();
            
       } catch (InterruptedException ex) {
                Logger.getLogger(AssignTransducers.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }//GEN-LAST:event_checkButtonActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        setAmplitude(-1, 1.0f, 1.0f);
        mf.clearSelection();
        mf.needUpdate();
    }//GEN-LAST:event_finishButtonActionPerformed

    private void erasePhaseCorrectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erasePhaseCorrectionButtonActionPerformed
        for(Transducer t : mf.simulation.getTransducers()){
            t.setPhaseCorrection( 0 );
        }
    }//GEN-LAST:event_erasePhaseCorrectionButtonActionPerformed

    private void selectTransducer(final int n){
        mf.clearSelection();
        final List<Transducer> trans = mf.simulation.transducers;
        if (n >= 0 && n < trans.size()){
            mf.setSelection( trans.get(n));
        }
        mf.needUpdate();
    }
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        selectTransducer( mf.simulation.getTransducers().indexOf( mf.selection.get(0)) + 1 );        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeSerial();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        selectTransducer( mf.simulation.getTransducers().indexOf( mf.selection.get(0)) - 1 );   
    }//GEN-LAST:event_prevButtonActionPerformed

    private void setPhaseCorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPhaseCorButtonActionPerformed
        for(Transducer t : mf.simulation.transducers){
            t.setPhaseCorrection( t.getPhase() );
        }
    }//GEN-LAST:event_setPhaseCorButtonActionPerformed

    private void seePhaseCorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seePhaseCorButtonActionPerformed
        for(Transducer t : mf.simulation.transducers){
            t.setPhase( t.getPhaseCorrection());
        }
        mf.needUpdate();
    }//GEN-LAST:event_seePhaseCorButtonActionPerformed

    private void checkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButton1ActionPerformed
        try {
            doCheckOnlyPhase();
        } catch (InterruptedException ex) {
            Logger.getLogger(AssignTransducers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkButton1ActionPerformed

    private void exportPhaseCorrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPhaseCorrButtonActionPerformed
        final StringBuilder sb = new StringBuilder();
        final int divs = Parse.toInt( exportDivsText.getText() );
        
        final ArrayList<Transducer> trans = mf.simulation.transducers;
        for(Transducer t : trans){
            final float phaseCor = t.getPhaseCorrection();
            int iPhaseCor = Transducer.calcDiscPhase(phaseCor, divs);
            sb.append( iPhaseCor + ",");
        }
        sb.deleteCharAt( sb.length() - 1);
        
        TextFrame.showText("Phase corrections", sb.toString(), this);
    }//GEN-LAST:event_exportPhaseCorrButtonActionPerformed

    @Override
    public void rxMsg(byte[] data, int len) {
        buffer.write(data, 0, len);
        if (buffer.size() >= nSamples*2){
            samplesRead = true;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amplitudeText;
    private javax.swing.JCheckBox autoAssignCheck;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton checkButton1;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton disconnectButton;
    private javax.swing.JButton erasePhaseCorrectionButton;
    private javax.swing.JTextField exportDivsText;
    private javax.swing.JButton exportPhaseCorrButton;
    private javax.swing.JButton finishButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox maxAmpCheck;
    private javax.swing.JTextField maxAmpText;
    private javax.swing.JTextField maxTransText;
    private javax.swing.JCheckBox minAmpCheck;
    private javax.swing.JTextField minAmpText;
    private javax.swing.JButton nextButton;
    private javax.swing.JCheckBox onlyPolCheck;
    private javax.swing.JCheckBox phaseCorrectionCheck;
    private javax.swing.JLabel phaseCorrectionLabel;
    private javax.swing.JTextField phaseRefText;
    private javax.swing.JTextField phaseText;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton seePhaseCorButton;
    private javax.swing.JTextField selectTransText;
    private javax.swing.JButton setPhaseCorButton;
    private javax.swing.JTextField speedText;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField targetTransText;
    private javax.swing.JTextField transNumberText;
    // End of variables declaration//GEN-END:variables

    
}
