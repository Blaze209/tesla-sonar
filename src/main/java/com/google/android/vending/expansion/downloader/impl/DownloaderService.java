package com.google.android.vending.expansion.downloader.impl;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import ku.f;
import ku.g;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DownloaderService extends com.google.android.vending.expansion.downloader.impl.a implements f {
    public static final String ACTION_DOWNLOADS_CHANGED = "downloadsChanged";
    public static final String ACTION_DOWNLOAD_COMPLETE = "lvldownloader.intent.action.DOWNLOAD_COMPLETE";
    public static final String ACTION_DOWNLOAD_STATUS = "lvldownloader.intent.action.DOWNLOAD_STATUS";
    public static final int CONTROL_PAUSED = 1;
    public static final int CONTROL_RUN = 0;
    public static final int DOWNLOAD_REQUIRED = 2;
    public static final String EXTRA_FILE_NAME = "downloadId";
    public static final String EXTRA_IS_WIFI_REQUIRED = "isWifiRequired";
    public static final String EXTRA_MESSAGE_HANDLER = "EMH";
    public static final String EXTRA_PACKAGE_NAME = "EPN";
    public static final String EXTRA_PENDING_INTENT = "EPI";
    public static final String EXTRA_STATUS_CURRENT_FILE_SIZE = "CFS";
    public static final String EXTRA_STATUS_CURRENT_PROGRESS = "CFP";
    public static final String EXTRA_STATUS_STATE = "ESS";
    public static final String EXTRA_STATUS_TOTAL_PROGRESS = "TFP";
    public static final String EXTRA_STATUS_TOTAL_SIZE = "ETS";
    private static final String LOG_TAG = "LVLDL";
    public static final int LVL_CHECK_REQUIRED = 1;
    public static final int NETWORK_CANNOT_USE_ROAMING = 5;
    public static final int NETWORK_MOBILE = 1;
    public static final int NETWORK_NO_CONNECTION = 2;
    public static final int NETWORK_OK = 1;
    public static final int NETWORK_RECOMMENDED_UNUSABLE_DUE_TO_SIZE = 4;
    public static final int NETWORK_TYPE_DISALLOWED_BY_REQUESTOR = 6;
    public static final int NETWORK_UNUSABLE_DUE_TO_SIZE = 3;
    public static final int NETWORK_WIFI = 2;
    public static final int NO_DOWNLOAD_REQUIRED = 0;
    private static final float SMOOTHING_FACTOR = 0.005f;
    public static final int STATUS_CANCELED = 490;
    public static final int STATUS_CANNOT_RESUME = 489;
    public static final int STATUS_DEVICE_NOT_FOUND_ERROR = 499;
    public static final int STATUS_FILE_ALREADY_EXISTS_ERROR = 488;
    public static final int STATUS_FILE_DELIVERED_INCORRECTLY = 487;
    public static final int STATUS_FILE_ERROR = 492;
    public static final int STATUS_FORBIDDEN = 403;
    public static final int STATUS_HTTP_DATA_ERROR = 495;
    public static final int STATUS_HTTP_EXCEPTION = 496;
    public static final int STATUS_INSUFFICIENT_SPACE_ERROR = 498;
    public static final int STATUS_PAUSED_BY_APP = 193;
    public static final int STATUS_PENDING = 190;
    public static final int STATUS_QUEUED_FOR_WIFI = 197;
    public static final int STATUS_QUEUED_FOR_WIFI_OR_CELLULAR_PERMISSION = 196;
    public static final int STATUS_RUNNING = 192;
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_TOO_MANY_REDIRECTS = 497;
    public static final int STATUS_UNHANDLED_HTTP_CODE = 494;
    public static final int STATUS_UNHANDLED_REDIRECT = 493;
    public static final int STATUS_UNKNOWN_ERROR = 491;
    public static final int STATUS_WAITING_FOR_NETWORK = 195;
    public static final int STATUS_WAITING_TO_RETRY = 194;
    private static final String TEMP_EXT = ".tmp";
    public static final int VISIBILITY_HIDDEN = 2;
    public static final int VISIBILITY_VISIBLE = 0;
    public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;
    private static boolean sIsRunning;
    private PendingIntent mAlarmIntent;
    float mAverageDownloadSpeed;
    long mBytesAtSample;
    long mBytesSoFar;
    private Messenger mClientMessenger;
    private BroadcastReceiver mConnReceiver;
    private ConnectivityManager mConnectivityManager;
    private int mControl;
    int mFileCount;
    private boolean mIsAtLeast3G;
    private boolean mIsAtLeast4G;
    private boolean mIsCellularConnection;
    private boolean mIsConnected;
    private boolean mIsFailover;
    private boolean mIsRoaming;
    long mMillisecondsAtSample;
    private c mNotification;
    private PackageInfo mPackageInfo;
    private PendingIntent mPendingIntent;
    private final Messenger mServiceMessenger;
    private final g mServiceStub;
    private boolean mStateChanged;
    private int mStatus;
    long mTotalLength;
    private WifiManager mWifiManager;

    public static class GenerateSaveFileError extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f43207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f43208b;

        public GenerateSaveFileError(int i11, String str) {
            this.f43207a = i11;
            this.f43208b = str;
        }
    }

    private class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Service f43209a;

        a(Service service) {
            this.f43209a = service;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloaderService.this.pollNetworkState();
            if (!DownloaderService.this.mStateChanged || DownloaderService.isServiceRunning()) {
                return;
            }
            Log.d(DownloaderService.LOG_TAG, "InnerBroadcastReceiver Called");
            Intent intent2 = new Intent(context, this.f43209a.getClass());
            intent2.putExtra(DownloaderService.EXTRA_PENDING_INTENT, DownloaderService.this.mPendingIntent);
            context.startService(intent2);
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f43211a;

        class a implements lu.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ lu.b f43213a;

            a(lu.b bVar) {
                this.f43213a = bVar;
            }

            @Override // lu.e
            public void a(int i11) {
                int i12;
                try {
                    int iG = this.f43213a.g();
                    e eVarA = e.a(b.this.f43211a);
                    if (iG != 0) {
                        i12 = 0;
                        for (int i13 = 0; i13 < iG; i13++) {
                            String strD = this.f43213a.d(i13);
                            if (strD != null) {
                                com.google.android.vending.expansion.downloader.impl.b bVar = new com.google.android.vending.expansion.downloader.impl.b(i13, strD, b.this.f43211a.getPackageName());
                                long jE = this.f43213a.e(i13);
                                if (DownloaderService.this.handleFileUpdated(eVarA, i13, strD, jE)) {
                                    bVar.a();
                                    bVar.f43216a = this.f43213a.f(i13);
                                    bVar.f43220e = jE;
                                    bVar.f43223h = -1;
                                    eVarA.j(bVar);
                                } else {
                                    com.google.android.vending.expansion.downloader.impl.b bVarC = eVarA.c(bVar.f43218c);
                                    if (bVarC == null) {
                                        Log.d(DownloaderService.LOG_TAG, "file " + bVar.f43218c + " found. Not downloading.");
                                        bVar.f43223h = 200;
                                        bVar.f43220e = jE;
                                        bVar.f43221f = jE;
                                        bVar.f43216a = this.f43213a.f(i13);
                                        eVarA.j(bVar);
                                    } else if (bVarC.f43223h != 200) {
                                        bVarC.f43216a = this.f43213a.f(i13);
                                        eVarA.j(bVarC);
                                    }
                                }
                                i12 = -1;
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    try {
                        eVarA.o(b.this.f43211a.getPackageManager().getPackageInfo(b.this.f43211a.getPackageName(), 0).versionCode, i12);
                        Class<?> cls = DownloaderService.this.getClass();
                        b bVar2 = b.this;
                        int iStartDownloadServiceIfRequired = DownloaderService.startDownloadServiceIfRequired(bVar2.f43211a, DownloaderService.this.mPendingIntent, cls);
                        if (iStartDownloadServiceIfRequired == 0) {
                            DownloaderService.this.mNotification.onDownloadStateChanged(5);
                        } else if (iStartDownloadServiceIfRequired == 1) {
                            Log.e(DownloaderService.LOG_TAG, "In LVL checking loop!");
                            DownloaderService.this.mNotification.onDownloadStateChanged(15);
                            throw new RuntimeException("Error with LVL checking and database integrity");
                        }
                        DownloaderService.setServiceRunning(false);
                    } catch (PackageManager.NameNotFoundException e11) {
                        e11.printStackTrace();
                        throw new RuntimeException("Error with getting information from package name");
                    }
                } catch (Throwable th2) {
                    DownloaderService.setServiceRunning(false);
                    throw th2;
                }
            }

            @Override // lu.e
            public void b(int i11) {
                try {
                    if (i11 != 291) {
                        if (i11 == 561) {
                            DownloaderService.this.mNotification.onDownloadStateChanged(15);
                        }
                        DownloaderService.setServiceRunning(false);
                    }
                    DownloaderService.this.mNotification.onDownloadStateChanged(16);
                    DownloaderService.setServiceRunning(false);
                } catch (Throwable th2) {
                    DownloaderService.setServiceRunning(false);
                    throw th2;
                }
            }

            @Override // lu.e
            public void c(int i11) {
                try {
                    DownloaderService.this.mNotification.onDownloadStateChanged(16);
                } finally {
                    DownloaderService.setServiceRunning(false);
                }
            }
        }

        b(Context context, PendingIntent pendingIntent) {
            this.f43211a = context;
            DownloaderService.this.mPendingIntent = pendingIntent;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloaderService.setServiceRunning(true);
            DownloaderService.this.mNotification.onDownloadStateChanged(2);
            lu.b bVar = new lu.b(this.f43211a, new lu.a(DownloaderService.this.getSALT(), this.f43211a.getPackageName(), Settings.Secure.getString(this.f43211a.getContentResolver(), "android_id")));
            bVar.h();
            new lu.d(this.f43211a, bVar, DownloaderService.this.getPublicKey()).f(new a(bVar));
        }
    }

    public DownloaderService() {
        super("LVLDownloadService");
        g gVarB = ku.c.b(this);
        this.mServiceStub = gVarB;
        this.mServiceMessenger = gVarB.b();
    }

    private void cancelAlarms() {
        if (this.mAlarmIntent != null) {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            if (alarmManager == null) {
                Log.e(LOG_TAG, "couldn't get alarm manager");
            } else {
                alarmManager.cancel(this.mAlarmIntent);
                this.mAlarmIntent = null;
            }
        }
    }

    private static boolean isLVLCheckRequired(e eVar, PackageInfo packageInfo) {
        return eVar.f43272e != packageInfo.versionCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized boolean isServiceRunning() {
        return sIsRunning;
    }

    public static boolean isStatusClientError(int i11) {
        return i11 >= 400 && i11 < 500;
    }

    public static boolean isStatusCompleted(int i11) {
        if (i11 < 200 || i11 >= 300) {
            return i11 >= 400 && i11 < 600;
        }
        return true;
    }

    public static boolean isStatusError(int i11) {
        return i11 >= 400 && i11 < 600;
    }

    public static boolean isStatusInformational(int i11) {
        return i11 >= 100 && i11 < 200;
    }

    public static boolean isStatusServerError(int i11) {
        return i11 >= 500 && i11 < 600;
    }

    public static boolean isStatusSuccess(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    private void scheduleAlarm(long j11) {
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        if (alarmManager == null) {
            Log.e(LOG_TAG, "couldn't get alarm manager");
            return;
        }
        String alarmReceiverClassName = getAlarmReceiverClassName();
        Intent intent = new Intent("android.intent.action.DOWNLOAD_WAKEUP");
        intent.putExtra(EXTRA_PENDING_INTENT, this.mPendingIntent);
        intent.setClassName(getPackageName(), alarmReceiverClassName);
        this.mAlarmIntent = PendingIntent.getBroadcast(this, 0, intent, 1073741824);
        alarmManager.set(0, System.currentTimeMillis() + j11, this.mAlarmIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setServiceRunning(boolean z11) {
        sIsRunning = z11;
    }

    public static int startDownloadServiceIfRequired(Context context, Intent intent, Class<?> cls) {
        return startDownloadServiceIfRequired(context, (PendingIntent) intent.getParcelableExtra(EXTRA_PENDING_INTENT), cls);
    }

    private void updateNetworkState(NetworkInfo networkInfo) {
        boolean z11 = this.mIsConnected;
        boolean z12 = this.mIsFailover;
        boolean z13 = this.mIsCellularConnection;
        boolean z14 = this.mIsRoaming;
        boolean z15 = this.mIsAtLeast3G;
        if (networkInfo != null) {
            this.mIsRoaming = networkInfo.isRoaming();
            this.mIsFailover = networkInfo.isFailover();
            this.mIsConnected = networkInfo.isConnected();
            updateNetworkType(networkInfo.getType(), networkInfo.getSubtype());
        } else {
            this.mIsRoaming = false;
            this.mIsFailover = false;
            this.mIsConnected = false;
            updateNetworkType(-1, -1);
        }
        this.mStateChanged = (!this.mStateChanged && z11 == this.mIsConnected && z12 == this.mIsFailover && z13 == this.mIsCellularConnection && z14 == this.mIsRoaming && z15 == this.mIsAtLeast3G) ? false : true;
    }

    private void updateNetworkType(int i11, int i12) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 6) {
                    this.mIsCellularConnection = true;
                    this.mIsAtLeast3G = true;
                    this.mIsAtLeast4G = true;
                    return;
                } else if (i11 != 7 && i11 != 9) {
                }
            }
            this.mIsCellularConnection = false;
            this.mIsAtLeast3G = false;
            this.mIsAtLeast4G = false;
            return;
        }
        this.mIsCellularConnection = true;
        switch (i12) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                this.mIsAtLeast3G = false;
                this.mIsAtLeast4G = false;
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                this.mIsAtLeast3G = true;
                this.mIsAtLeast4G = false;
                break;
            case 12:
            default:
                this.mIsCellularConnection = false;
                this.mIsAtLeast3G = false;
                this.mIsAtLeast4G = false;
                break;
            case 13:
            case 14:
            case 15:
                this.mIsAtLeast3G = true;
                this.mIsAtLeast4G = true;
                break;
        }
    }

    public String generateSaveFile(String str, long j11) throws GenerateSaveFileError {
        String strGenerateTempSaveFileName = generateTempSaveFileName(str);
        File file = new File(strGenerateTempSaveFileName);
        if (!ku.d.j()) {
            Log.d(LOG_TAG, "External media not mounted: " + strGenerateTempSaveFileName);
            throw new GenerateSaveFileError(STATUS_DEVICE_NOT_FOUND_ERROR, "external media is not yet mounted");
        }
        if (!file.exists()) {
            if (ku.d.c(ku.d.f(strGenerateTempSaveFileName)) >= j11) {
                return strGenerateTempSaveFileName;
            }
            throw new GenerateSaveFileError(STATUS_INSUFFICIENT_SPACE_ERROR, "insufficient space on external storage");
        }
        Log.d(LOG_TAG, "File already exists: " + strGenerateTempSaveFileName);
        throw new GenerateSaveFileError(STATUS_FILE_ALREADY_EXISTS_ERROR, "requested destination file already exists");
    }

    public String generateTempSaveFileName(String str) {
        return ku.d.g(this) + File.separator + str + TEMP_EXT;
    }

    public abstract String getAlarmReceiverClassName();

    public int getControl() {
        return this.mControl;
    }

    public String getLogMessageForNetworkError(int i11) {
        if (i11 == 2) {
            return "no network connection available";
        }
        if (i11 == 3) {
            return "download size exceeds limit for mobile network";
        }
        if (i11 == 4) {
            return "download size exceeds recommended limit for mobile network";
        }
        if (i11 != 5) {
            return i11 != 6 ? "unknown error with network connectivity" : "download was requested to not use the current network type";
        }
        return "download cannot use the current network connection because it is roaming";
    }

    public int getNetworkAvailabilityState(e eVar) {
        if (!this.mIsConnected) {
            return 2;
        }
        if (!this.mIsCellularConnection) {
            return 1;
        }
        int i11 = eVar.f43274g;
        if (this.mIsRoaming) {
            return 5;
        }
        return (i11 & 1) != 0 ? 1 : 6;
    }

    public abstract String getPublicKey();

    public abstract byte[] getSALT();

    public int getStatus() {
        return this.mStatus;
    }

    public boolean handleFileUpdated(e eVar, int i11, String str, long j11) throws Throwable {
        String str2;
        com.google.android.vending.expansion.downloader.impl.b bVarC = eVar.c(str);
        if (bVarC != null && (str2 = bVarC.f43218c) != null) {
            if (str.equals(str2)) {
                return false;
            }
            File file = new File(ku.d.b(this, str2));
            if (file.exists()) {
                file.delete();
            }
        }
        return true ^ ku.d.a(this, str, j11, true);
    }

    public boolean isWiFi() {
        return this.mIsConnected && !this.mIsCellularConnection;
    }

    public void notifyUpdateBytes(long j11) {
        long j12;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j13 = this.mMillisecondsAtSample;
        if (0 != j13) {
            float f11 = (j11 - this.mBytesAtSample) / (jUptimeMillis - j13);
            float f12 = this.mAverageDownloadSpeed;
            if (BitmapDescriptorFactory.HUE_RED != f12) {
                this.mAverageDownloadSpeed = (f11 * SMOOTHING_FACTOR) + (f12 * 0.995f);
            } else {
                this.mAverageDownloadSpeed = f11;
            }
            j12 = (long) ((this.mTotalLength - j11) / this.mAverageDownloadSpeed);
        } else {
            j12 = -1;
        }
        long j14 = j12;
        this.mMillisecondsAtSample = jUptimeMillis;
        this.mBytesAtSample = j11;
        this.mNotification.onDownloadProgress(new ku.a(this.mTotalLength, j11, j14, this.mAverageDownloadSpeed));
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a, android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d(LOG_TAG, "Service Bound");
        return this.mServiceMessenger.getBinder();
    }

    @Override // ku.f
    public void onClientUpdated(Messenger messenger) {
        this.mClientMessenger = messenger;
        this.mNotification.c(messenger);
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a, android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            this.mPackageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.mNotification = new c(this, getPackageManager().getApplicationLabel(getApplicationInfo()));
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a, android.app.Service
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.mConnReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.mConnReceiver = null;
        }
        this.mServiceStub.c(this);
        super.onDestroy();
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a
    protected void onHandleIntent(Intent intent) {
        int i11;
        int i12;
        boolean z11 = true;
        setServiceRunning(true);
        try {
            e eVarA = e.a(this);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(EXTRA_PENDING_INTENT);
            if (pendingIntent != null) {
                this.mNotification.b(pendingIntent);
                this.mPendingIntent = pendingIntent;
            } else {
                PendingIntent pendingIntent2 = this.mPendingIntent;
                if (pendingIntent2 == null) {
                    Log.e(LOG_TAG, "Downloader started in bad state without notification intent.");
                    return;
                }
                this.mNotification.b(pendingIntent2);
            }
            if (isLVLCheckRequired(eVarA, this.mPackageInfo)) {
                updateLVL(this);
                return;
            }
            com.google.android.vending.expansion.downloader.impl.b[] bVarArrE = eVarA.e();
            long j11 = 0;
            this.mBytesSoFar = 0L;
            this.mTotalLength = 0L;
            this.mFileCount = bVarArrE.length;
            for (com.google.android.vending.expansion.downloader.impl.b bVar : bVarArrE) {
                if (bVar.f43223h == 200 && !ku.d.a(this, bVar.f43218c, bVar.f43220e, true)) {
                    bVar.f43223h = 0;
                    bVar.f43221f = 0L;
                }
                this.mTotalLength += bVar.f43220e;
                this.mBytesSoFar += bVar.f43221f;
            }
            pollNetworkState();
            if (this.mConnReceiver == null) {
                this.mConnReceiver = new a(this);
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                registerReceiver(this.mConnReceiver, intentFilter);
            }
            int length = bVarArrE.length;
            int i13 = 0;
            while (i13 < length) {
                com.google.android.vending.expansion.downloader.impl.b bVar2 = bVarArrE[i13];
                long j12 = bVar2.f43221f;
                if (bVar2.f43223h != 200) {
                    d dVar = new d(bVar2, this, this.mNotification);
                    cancelAlarms();
                    scheduleAlarm(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                    dVar.u();
                    cancelAlarms();
                }
                eVarA.n(bVar2);
                int i14 = bVar2.f43223h;
                if (i14 != 200) {
                    if (i14 == 403) {
                        updateLVL(this);
                        return;
                    }
                    if (i14 == 487) {
                        bVar2.f43221f = j11;
                        eVarA.j(bVar2);
                        i11 = 13;
                    } else if (i14 == 490) {
                        i11 = 18;
                    } else if (i14 == 498) {
                        i11 = 17;
                    } else if (i14 != 499) {
                        switch (i14) {
                            case 193:
                                i12 = 7;
                                i11 = i12;
                                z11 = false;
                                break;
                            case 194:
                            case 195:
                                i11 = 6;
                                break;
                            case 196:
                            case 197:
                                WifiManager wifiManager = this.mWifiManager;
                                i11 = (wifiManager != null && !wifiManager.isWifiEnabled()) ? 8 : 9;
                                break;
                            default:
                                i12 = 19;
                                i11 = i12;
                                z11 = false;
                                break;
                        }
                    } else {
                        i11 = 14;
                    }
                    if (z11) {
                        scheduleAlarm(60000L);
                    } else {
                        cancelAlarms();
                    }
                    this.mNotification.onDownloadStateChanged(i11);
                    return;
                }
                this.mBytesSoFar += bVar2.f43221f - j12;
                eVarA.o(this.mPackageInfo.versionCode, 0);
                i13++;
                j11 = 0;
            }
            this.mNotification.onDownloadStateChanged(5);
        } finally {
            setServiceRunning(false);
        }
    }

    void pollNetworkState() {
        if (this.mConnectivityManager == null) {
            this.mConnectivityManager = (ConnectivityManager) getSystemService("connectivity");
        }
        if (this.mWifiManager == null) {
            this.mWifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        }
        ConnectivityManager connectivityManager = this.mConnectivityManager;
        if (connectivityManager == null) {
            Log.w(LOG_TAG, "couldn't get connectivity manager to poll network state");
        } else {
            updateNetworkState(connectivityManager.getActiveNetworkInfo());
        }
    }

    @Override // ku.f
    public void requestAbortDownload() {
        this.mControl = 1;
        this.mStatus = STATUS_CANCELED;
    }

    @Override // ku.f
    public void requestContinueDownload() {
        if (this.mControl == 1) {
            this.mControl = 0;
        }
        Intent intent = new Intent(this, getClass());
        intent.putExtra(EXTRA_PENDING_INTENT, this.mPendingIntent);
        startService(intent);
    }

    @Override // ku.f
    public void requestDownloadStatus() {
        this.mNotification.a();
    }

    @Override // ku.f
    public void requestPauseDownload() {
        this.mControl = 1;
        this.mStatus = 193;
    }

    @Override // ku.f
    public void setDownloadFlags(int i11) {
        e.a(this).m(i11);
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a
    protected boolean shouldStop() {
        return e.a(this).f43273f == 0;
    }

    public void updateLVL(Context context) {
        Context applicationContext = context.getApplicationContext();
        new Handler(applicationContext.getMainLooper()).post(new b(applicationContext, this.mPendingIntent));
    }

    public static int startDownloadServiceIfRequired(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return startDownloadServiceIfRequired(context, pendingIntent, context.getPackageName(), cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    public static int startDownloadServiceIfRequired(Context context, PendingIntent pendingIntent, String str, String str2) throws Throwable {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        e eVarA = e.a(context);
        ?? IsLVLCheckRequired = isLVLCheckRequired(eVarA, packageInfo);
        if (eVarA.f43273f != 0) {
            IsLVLCheckRequired = 2;
            break;
        }
        com.google.android.vending.expansion.downloader.impl.b[] bVarArrE = eVarA.e();
        if (bVarArrE != null) {
            for (com.google.android.vending.expansion.downloader.impl.b bVar : bVarArrE) {
                if (!ku.d.a(context, bVar.f43218c, bVar.f43220e, true)) {
                    eVarA.q(-1);
                    IsLVLCheckRequired = 2;
                    break;
                }
            }
        }
        if (IsLVLCheckRequired != 1 && IsLVLCheckRequired != 2) {
            return IsLVLCheckRequired;
        }
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        intent.putExtra(EXTRA_PENDING_INTENT, pendingIntent);
        context.startService(intent);
        return IsLVLCheckRequired;
    }
}
