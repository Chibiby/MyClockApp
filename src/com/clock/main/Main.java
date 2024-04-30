package com.clock.main;

import com.clock.components.CountDownTimer;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    double currentHour, currentMinute, currentSeconds;
    private Thread timerThread;
    private long startTime;
    private CountDownTimer timer;
    int hour, minute;
    String hourstring = "";
    String minutestring = "";

    public Main() {
        initComponents();
        UIManager.put("Button.focus", new Color(0, 0, 0, 0));
        clock();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        FrontPane = new javax.swing.JLayeredPane();
        mainPanel1 = new com.clock.panel.MainPanel();
        txtClock = new javax.swing.JLabel();
        clock1 = new com.clock.components.Clock();
        btnAlarm = new com.clock.components.Button();
        btnTimer = new com.clock.components.Button();
        btnStopwatch = new com.clock.components.Button();
        txtCurrentTime = new javax.swing.JLabel();
        AlarmPane = new javax.swing.JLayeredPane();
        mainPanel2 = new com.clock.panel.MainPanel();
        txtAlarm = new javax.swing.JLabel();
        btnSetAlarm = new com.clock.components.Button();
        btnReturn = new com.clock.components.Button();
        txtCurrentTime1 = new javax.swing.JLabel();
        txtHourLabel = new javax.swing.JLabel();
        txtHourLabel1 = new javax.swing.JLabel();
        btnStopAlarm = new com.clock.components.Button();
        jcboxHour = new javax.swing.JComboBox<>();
        jcboxMinute = new javax.swing.JComboBox<>();
        TimerPane = new javax.swing.JLayeredPane();
        mainPanel3 = new com.clock.panel.MainPanel();
        txtAlarm1 = new javax.swing.JLabel();
        btnStartTimer = new com.clock.components.Button();
        btnReturn1 = new com.clock.components.Button();
        txtTimer = new javax.swing.JLabel();
        txtHourLabel3 = new javax.swing.JLabel();
        txtHourLabel4 = new javax.swing.JLabel();
        btnResetTimer = new com.clock.components.Button();
        btnStopTimer = new com.clock.components.Button();
        jcboxMinute1 = new javax.swing.JComboBox<>();
        jcboxHour1 = new javax.swing.JComboBox<>();
        StopWatchPane = new javax.swing.JLayeredPane();
        mainPanel4 = new com.clock.panel.MainPanel();
        txtAlarm2 = new javax.swing.JLabel();
        btnStart = new com.clock.components.Button();
        btnReturn2 = new com.clock.components.Button();
        btnReset = new com.clock.components.Button();
        txtStopWatchTimer = new javax.swing.JLabel();
        btnStop = new com.clock.components.Button();
        txtStopWatchTimer2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clock Desktop App");

        mainPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        txtClock.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        txtClock.setForeground(new java.awt.Color(255, 255, 204));
        txtClock.setText("CLOCK");

        btnAlarm.setForeground(new java.awt.Color(183, 144, 0));
        btnAlarm.setText("Alarm");
        btnAlarm.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmActionPerformed(evt);
            }
        });

        btnTimer.setForeground(new java.awt.Color(183, 144, 0));
        btnTimer.setText("Timer");
        btnTimer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimerActionPerformed(evt);
            }
        });

        btnStopwatch.setForeground(new java.awt.Color(183, 144, 0));
        btnStopwatch.setText("Stopwatch");
        btnStopwatch.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnStopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopwatchActionPerformed(evt);
            }
        });

        txtCurrentTime.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtCurrentTime.setForeground(new java.awt.Color(255, 255, 204));
        txtCurrentTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCurrentTime.setText("00 : 00 : 00");

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClock)
                            .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtCurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnStopwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtClock)
                .addGap(18, 18, 18)
                .addComponent(txtCurrentTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStopwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        FrontPane.setLayer(mainPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FrontPaneLayout = new javax.swing.GroupLayout(FrontPane);
        FrontPane.setLayout(FrontPaneLayout);
        FrontPaneLayout.setHorizontalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        mainPanel2.setPreferredSize(new java.awt.Dimension(500, 300));

        txtAlarm.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        txtAlarm.setForeground(new java.awt.Color(255, 255, 204));
        txtAlarm.setText("ALARM");

        btnSetAlarm.setForeground(new java.awt.Color(183, 144, 0));
        btnSetAlarm.setText("Set Alarm");
        btnSetAlarm.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSetAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetAlarmActionPerformed(evt);
            }
        });

        btnReturn.setForeground(new java.awt.Color(183, 144, 0));
        btnReturn.setText("< Return");
        btnReturn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        txtCurrentTime1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtCurrentTime1.setForeground(new java.awt.Color(255, 255, 204));
        txtCurrentTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCurrentTime1.setText("00 : 00 : 00");

        txtHourLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtHourLabel.setForeground(new java.awt.Color(255, 255, 204));
        txtHourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHourLabel.setText("Hours");

        txtHourLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtHourLabel1.setForeground(new java.awt.Color(255, 255, 204));
        txtHourLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHourLabel1.setText("Minutes");

        btnStopAlarm.setForeground(new java.awt.Color(183, 144, 0));
        btnStopAlarm.setText("Stop Alarm");
        btnStopAlarm.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnStopAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopAlarmActionPerformed(evt);
            }
        });

        jcboxHour.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jcboxHour.setForeground(new java.awt.Color(183, 144, 0));
        jcboxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        jcboxMinute.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jcboxMinute.setForeground(new java.awt.Color(183, 144, 0));
        jcboxMinute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "00" }));

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtCurrentTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txtAlarm))))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSetAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                            .addGroup(mainPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jcboxHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHourLabel))
                                .addGap(72, 72, 72)))
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jcboxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnStopAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHourLabel1))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtAlarm)
                        .addGap(18, 18, 18)
                        .addComponent(txtCurrentTime1)
                        .addGap(40, 40, 40)
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHourLabel)
                            .addComponent(txtHourLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcboxHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcboxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSetAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStopAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btnStopAlarm.setEnabled(false);

        AlarmPane.setLayer(mainPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AlarmPaneLayout = new javax.swing.GroupLayout(AlarmPane);
        AlarmPane.setLayout(AlarmPaneLayout);
        AlarmPaneLayout.setHorizontalGroup(
            AlarmPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        AlarmPaneLayout.setVerticalGroup(
            AlarmPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        mainPanel3.setPreferredSize(new java.awt.Dimension(500, 300));

        txtAlarm1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        txtAlarm1.setForeground(new java.awt.Color(255, 255, 204));
        txtAlarm1.setText("TIMER");

        btnStartTimer.setForeground(new java.awt.Color(183, 144, 0));
        btnStartTimer.setText("Start");
        btnStartTimer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnStartTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartTimerActionPerformed(evt);
            }
        });

        btnReturn1.setForeground(new java.awt.Color(183, 144, 0));
        btnReturn1.setText("< Return");
        btnReturn1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn1ActionPerformed(evt);
            }
        });

        txtTimer.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtTimer.setForeground(new java.awt.Color(255, 255, 204));
        txtTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTimer.setText("00 : 00 : 00");

        txtHourLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtHourLabel3.setForeground(new java.awt.Color(255, 255, 204));
        txtHourLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHourLabel3.setText("Hours");

        txtHourLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtHourLabel4.setForeground(new java.awt.Color(255, 255, 204));
        txtHourLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHourLabel4.setText("Minutes");

        btnResetTimer.setForeground(new java.awt.Color(183, 144, 0));
        btnResetTimer.setText("Reset");
        btnResetTimer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnResetTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTimerActionPerformed(evt);
            }
        });

        btnStopTimer.setForeground(new java.awt.Color(183, 144, 0));
        btnStopTimer.setText("Stop");
        btnStopTimer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnStopTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopTimerActionPerformed(evt);
            }
        });

        jcboxMinute1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jcboxMinute1.setForeground(new java.awt.Color(183, 144, 0));
        jcboxMinute1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "00" }));

        jcboxHour1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jcboxHour1.setForeground(new java.awt.Color(183, 144, 0));
        jcboxHour1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        javax.swing.GroupLayout mainPanel3Layout = new javax.swing.GroupLayout(mainPanel3);
        mainPanel3.setLayout(mainPanel3Layout);
        mainPanel3Layout.setHorizontalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnStartTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnStopTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanel3Layout.createSequentialGroup()
                                .addComponent(btnReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(txtAlarm1))))
                    .addGroup(mainPanel3Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHourLabel3)
                            .addComponent(jcboxHour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcboxMinute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHourLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanel3Layout.setVerticalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtAlarm1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(txtTimer)
                .addGap(29, 29, 29)
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHourLabel3)
                    .addComponent(txtHourLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboxHour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboxMinute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStartTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStopTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        btnStopTimer.setEnabled(false);

        TimerPane.setLayer(mainPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout TimerPaneLayout = new javax.swing.GroupLayout(TimerPane);
        TimerPane.setLayout(TimerPaneLayout);
        TimerPaneLayout.setHorizontalGroup(
            TimerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        TimerPaneLayout.setVerticalGroup(
            TimerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        mainPanel4.setPreferredSize(new java.awt.Dimension(500, 300));

        txtAlarm2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        txtAlarm2.setForeground(new java.awt.Color(255, 255, 204));
        txtAlarm2.setText("STOPWATCH");

        btnStart.setForeground(new java.awt.Color(183, 144, 0));
        btnStart.setText("Start");
        btnStart.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnReturn2.setForeground(new java.awt.Color(183, 144, 0));
        btnReturn2.setText("< Return");
        btnReturn2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnReturn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn2ActionPerformed(evt);
            }
        });

        btnReset.setForeground(new java.awt.Color(183, 144, 0));
        btnReset.setText("Reset");
        btnReset.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtStopWatchTimer.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        txtStopWatchTimer.setForeground(new java.awt.Color(255, 255, 204));
        txtStopWatchTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStopWatchTimer.setText("00 : 00 : 00");

        btnStop.setForeground(new java.awt.Color(183, 144, 0));
        btnStop.setText("Stop");
        btnStop.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        txtStopWatchTimer2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtStopWatchTimer2.setForeground(new java.awt.Color(255, 255, 204));
        txtStopWatchTimer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStopWatchTimer2.setText("00");

        javax.swing.GroupLayout mainPanel4Layout = new javax.swing.GroupLayout(mainPanel4);
        mainPanel4.setLayout(mainPanel4Layout);
        mainPanel4Layout.setHorizontalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel4Layout.createSequentialGroup()
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReturn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlarm2)
                            .addGroup(mainPanel4Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtStopWatchTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStopWatchTimer2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(mainPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        mainPanel4Layout.setVerticalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnReturn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtAlarm2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStopWatchTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStopWatchTimer2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        btnStop.setEnabled(false);

        StopWatchPane.setLayer(mainPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout StopWatchPaneLayout = new javax.swing.GroupLayout(StopWatchPane);
        StopWatchPane.setLayout(StopWatchPaneLayout);
        StopWatchPaneLayout.setHorizontalGroup(
            StopWatchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        StopWatchPaneLayout.setVerticalGroup(
            StopWatchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrontPane)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AlarmPane)
                    .addGap(0, 0, 0)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(TimerPane)
                    .addGap(0, 0, 0)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(StopWatchPane)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrontPane)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AlarmPane)
                    .addGap(0, 0, 0)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(TimerPane)
                    .addGap(0, 0, 0)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(StopWatchPane)
                    .addGap(0, 0, 0)))
        );

        AlarmPane.setVisible(false);
        TimerPane.setVisible(false);
        StopWatchPane.setVisible(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//Front Page Source code
    private void btnAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmActionPerformed
        FrontPane.setVisible(false);
        AlarmPane.setVisible(true);
    }//GEN-LAST:event_btnAlarmActionPerformed

    private void btnTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimerActionPerformed
        FrontPane.setVisible(false);
        TimerPane.setVisible(true);
    }//GEN-LAST:event_btnTimerActionPerformed

    private void btnStopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopwatchActionPerformed
        FrontPane.setVisible(false);
        StopWatchPane.setVisible(true);
    }//GEN-LAST:event_btnStopwatchActionPerformed

//Alarm Page Source code
    private void btnSetAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetAlarmActionPerformed
        hourstring = String.format("%02d", jcboxHour.getSelectedIndex());
        minutestring = String.format("%02d", jcboxMinute.getSelectedIndex());

        if (hourstring.equals(00) && minutestring.equals(00)) {
            JOptionPane.showMessageDialog(null, "NO Alarm has been set");
        } else {
            jcboxHour.setEnabled(false);
            jcboxMinute.setEnabled(false);
            alarm();
        }

        btnSetAlarm.setEnabled(false);
        btnStopAlarm.setEnabled(true);
    }//GEN-LAST:event_btnSetAlarmActionPerformed

    private void btnStopAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopAlarmActionPerformed
        jcboxHour.setEnabled(true);
        jcboxMinute.setEnabled(true);
        btnSetAlarm.setEnabled(true);
        btnStopAlarm.setEnabled(false);
    }//GEN-LAST:event_btnStopAlarmActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        AlarmPane.setVisible(false);
        FrontPane.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

//Timer Page Source code
    private void btnStartTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartTimerActionPerformed
        hourstring = String.format("%02d", jcboxHour1.getSelectedIndex());
        minutestring = String.format("%02d", jcboxMinute1.getSelectedIndex());

        int totalSeconds = (jcboxHour1.getSelectedIndex() * 60 * 60) + (jcboxMinute1.getSelectedIndex() * 60);
        timer = new CountDownTimer(totalSeconds * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000 % 60;
                long minutes = millisUntilFinished / 1000 / 60 % 60;
                long hours = millisUntilFinished / 1000 / 60 / 60;
                txtTimer.setText(String.format("%02d : %02d : %02d", hours, minutes, seconds));
            }

            @Override
            public void onFinish() {
                txtTimer.setText(" 00 : 00 : 00");
            }
        };
        timer.start();
        btnStopTimer.setEnabled(true);
        btnStartTimer.setEnabled(false);
    }//GEN-LAST:event_btnStartTimerActionPerformed

    private void btnStopTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopTimerActionPerformed
        if (timer != null) {
            timer.stop();
            btnStopTimer.setEnabled(false);
            btnStartTimer.setEnabled(true);
        }
    }//GEN-LAST:event_btnStopTimerActionPerformed

    private void btnResetTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTimerActionPerformed
       if (timer != null) {
            timer.reset();
        }
        txtTimer.setText("00 : 00 : 00");
        btnStopTimer.setEnabled(true);
        btnStartTimer.setEnabled(true);
    }//GEN-LAST:event_btnResetTimerActionPerformed

    private void btnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn1ActionPerformed
        TimerPane.setVisible(false);
        FrontPane.setVisible(true);
    }//GEN-LAST:event_btnReturn1ActionPerformed

//StopWatch page Source code
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        startTime = System.currentTimeMillis();
        timerThread = new Thread(() -> {
            while (true) {
                long elapsedTime = System.currentTimeMillis() - startTime;
                long hours = elapsedTime / 3600000;
                long minutes = (elapsedTime % 3600000) / 60000;
                long seconds = (elapsedTime % 60000) / 1000;
                long milliseconds = (elapsedTime % 1000) / 10;
                String timeString = String.format("%02d : %02d : %02d", hours, minutes, seconds);
                String miliTimeString = String.format("%02d", milliseconds);
                txtStopWatchTimer.setText(timeString);
                txtStopWatchTimer2.setText(miliTimeString);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    break;
                }
            }
        });
        timerThread.start();
        btnStop.setEnabled(true);
        btnStart.setEnabled(false);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        if (timerThread != null) {
            timerThread.interrupt();
            timerThread = null;
        }
        btnStop.setEnabled(false);
        btnStart.setEnabled(true);
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        if (timerThread != null) {
            timerThread.interrupt();
            timerThread = null;
            txtStopWatchTimer.setText("00 : 00 : 00");
            txtStopWatchTimer2.setText("00");
        } else {
            txtStopWatchTimer.setText("00 : 00 : 00");
            txtStopWatchTimer2.setText("00");
        }
        btnStop.setEnabled(true);
        btnStart.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReturn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn2ActionPerformed
        StopWatchPane.setVisible(false);
        FrontPane.setVisible(true);
    }//GEN-LAST:event_btnReturn2ActionPerformed

    
//Analog and Digital Clock Design source codes   
    public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    while (true) {

                        Calendar cal = new GregorianCalendar();

                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR_OF_DAY);

                        String timeSuffix = (hour < 12) ? "AM" : "PM";
                        hour = (hour > 12) ? hour - 12 : hour;
                        hour = (hour == 0) ? 12 : hour;

                        currentHour = hour;
                        currentMinute = minute;
                        currentSeconds = second;

                        txtCurrentTime.setText(hour + ":" + minute + ":" + second + " " + timeSuffix);
                        txtCurrentTime1.setText(hour + ":" + minute + ":" + second + " " + timeSuffix);

                        sleep(1000);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);

                }
            }
        };
        clock.start();

    }
    
//Alarm Clock Monitor Time Source code
    public void alarm() {
        Thread alarm = new Thread() {
            public void run() {
                try {
                    while (true) {

                        Calendar now = Calendar.getInstance();
                        int hour = now.get(Calendar.HOUR_OF_DAY);
                        int minute = now.get(Calendar.MINUTE);

                        String hourString = String.format("%02d", hour);
                        String minuteString = String.format("%02d", minute);

                        if (hourString.equals(hourstring) && minuteString.equals(minutestring)) {
                            try {
                                InputStream inputStream = getClass().getResourceAsStream("/com/clock/components/sound.wav");
                                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
                                Clip clip = AudioSystem.getClip();
                                clip.open(audioInputStream);
                                clip.start();
                            } catch (IOException | javax.sound.sampled.UnsupportedAudioFileException | javax.sound.sampled.LineUnavailableException e) {
                                e.printStackTrace();
                            }
                            JOptionPane.showMessageDialog(null, "Alarm has been triggered");
                            jcboxHour.setEnabled(true);
                            jcboxMinute.setEnabled(true);
                            break;
                        }

                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        };
        alarm.start();

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AlarmPane;
    private javax.swing.JLayeredPane FrontPane;
    private javax.swing.JLayeredPane StopWatchPane;
    private javax.swing.JLayeredPane TimerPane;
    private com.clock.components.Button btnAlarm;
    private com.clock.components.Button btnReset;
    private com.clock.components.Button btnResetTimer;
    private com.clock.components.Button btnReturn;
    private com.clock.components.Button btnReturn1;
    private com.clock.components.Button btnReturn2;
    private com.clock.components.Button btnSetAlarm;
    private com.clock.components.Button btnStart;
    private com.clock.components.Button btnStartTimer;
    private com.clock.components.Button btnStop;
    private com.clock.components.Button btnStopAlarm;
    private com.clock.components.Button btnStopTimer;
    private com.clock.components.Button btnStopwatch;
    private com.clock.components.Button btnTimer;
    private com.clock.components.Clock clock1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jcboxHour;
    private javax.swing.JComboBox<String> jcboxHour1;
    private javax.swing.JComboBox<String> jcboxMinute;
    private javax.swing.JComboBox<String> jcboxMinute1;
    private com.clock.panel.MainPanel mainPanel1;
    private com.clock.panel.MainPanel mainPanel2;
    private com.clock.panel.MainPanel mainPanel3;
    private com.clock.panel.MainPanel mainPanel4;
    private javax.swing.JLabel txtAlarm;
    private javax.swing.JLabel txtAlarm1;
    private javax.swing.JLabel txtAlarm2;
    private javax.swing.JLabel txtClock;
    private javax.swing.JLabel txtCurrentTime;
    private javax.swing.JLabel txtCurrentTime1;
    private javax.swing.JLabel txtHourLabel;
    private javax.swing.JLabel txtHourLabel1;
    private javax.swing.JLabel txtHourLabel3;
    private javax.swing.JLabel txtHourLabel4;
    private javax.swing.JLabel txtStopWatchTimer;
    private javax.swing.JLabel txtStopWatchTimer2;
    private javax.swing.JLabel txtTimer;
    // End of variables declaration//GEN-END:variables
}
