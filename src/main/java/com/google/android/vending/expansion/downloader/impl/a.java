package com.google.android.vending.expansion.downloader.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends Service {
    private static final String LOG_TAG = "CustomIntentService";
    private static final int WHAT_MESSAGE = -10;
    private String mName;
    private boolean mRedelivery;
    private volatile HandlerC0676a mServiceHandler;
    private volatile Looper mServiceLooper;

    /* JADX INFO: renamed from: com.google.android.vending.expansion.downloader.impl.a$a, reason: collision with other inner class name */
    private final class HandlerC0676a extends Handler {
        public HandlerC0676a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a.this.onHandleIntent((Intent) message.obj);
            if (a.this.shouldStop()) {
                Log.d(a.LOG_TAG, "stopSelf");
                a.this.stopSelf(message.arg1);
                Log.d(a.LOG_TAG, "afterStopSelf");
            }
        }
    }

    public a(String str) {
        this.mName = str;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.mName + "]");
        handlerThread.start();
        this.mServiceLooper = handlerThread.getLooper();
        this.mServiceHandler = new HandlerC0676a(this.mServiceLooper);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Thread thread = this.mServiceLooper.getThread();
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
        }
        this.mServiceLooper.quit();
        Log.d(LOG_TAG, "onDestroy");
    }

    protected abstract void onHandleIntent(Intent intent);

    @Override // android.app.Service
    public void onStart(Intent intent, int i11) {
        if (this.mServiceHandler.hasMessages(WHAT_MESSAGE)) {
            return;
        }
        Message messageObtainMessage = this.mServiceHandler.obtainMessage();
        messageObtainMessage.arg1 = i11;
        messageObtainMessage.obj = intent;
        messageObtainMessage.what = WHAT_MESSAGE;
        this.mServiceHandler.sendMessage(messageObtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        onStart(intent, i12);
        return this.mRedelivery ? 3 : 2;
    }

    public void setIntentRedelivery(boolean z11) {
        this.mRedelivery = z11;
    }

    protected abstract boolean shouldStop();
}
