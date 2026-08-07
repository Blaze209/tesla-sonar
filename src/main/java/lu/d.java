package lu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.licensing.ILicensingService;
import com.google.android.vending.licensing.util.Base64DecoderException;
import com.plaid.internal.EnumC4419g;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class d implements ServiceConnection {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final SecureRandom f90754j = new SecureRandom();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ILicensingService f90755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PublicKey f90756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f90757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f90758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f90759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f90760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f90761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<f> f90762h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Queue<f> f90763i = new LinkedList();

    private class a extends com.android.vending.licensing.a.AbstractBinderC0409a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final f f90764n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Runnable f90765o;

        /* JADX INFO: renamed from: lu.d$a$a, reason: collision with other inner class name */
        class RunnableC1930a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f90767a;

            RunnableC1930a(d dVar) {
                this.f90767a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i("LicenseChecker", "Check timed out.");
                a aVar = a.this;
                d.this.l(aVar.f90764n);
                a aVar2 = a.this;
                d.this.h(aVar2.f90764n);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f90769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f90770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f90771c;

            b(int i11, String str, String str2) {
                this.f90769a = i11;
                this.f90770b = str;
                this.f90771c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i("LicenseChecker", "Received response.");
                if (d.this.f90762h.contains(a.this.f90764n)) {
                    a.this.T2();
                    a.this.f90764n.g(d.this.f90756b, this.f90769a, this.f90770b, this.f90771c);
                    a aVar = a.this;
                    d.this.h(aVar.f90764n);
                }
            }
        }

        public a(f fVar) {
            this.f90764n = fVar;
            this.f90765o = new RunnableC1930a(d.this);
            U2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void T2() {
            Log.i("LicenseChecker", "Clearing timeout.");
            d.this.f90759e.removeCallbacks(this.f90765o);
        }

        private void U2() {
            Log.i("LicenseChecker", "Start monitoring timeout.");
            d.this.f90759e.postDelayed(this.f90765o, 10000L);
        }

        @Override // com.android.vending.licensing.a
        public void p0(int i11, String str, String str2) {
            d.this.f90759e.post(new b(i11, str, str2));
        }
    }

    public d(Context context, i iVar, String str) {
        this.f90757c = context;
        this.f90758d = iVar;
        this.f90756b = j(str);
        String packageName = context.getPackageName();
        this.f90760f = packageName;
        this.f90761g = k(context, packageName);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f90759e = new Handler(handlerThread.getLooper());
    }

    private void g() {
        if (this.f90755a != null) {
            try {
                this.f90757c.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f90755a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h(f fVar) {
        this.f90762h.remove(fVar);
        if (this.f90762h.isEmpty()) {
            g();
        }
    }

    private int i() {
        return f90754j.nextInt();
    }

    private static PublicKey j(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(mu.a.a(str)));
        } catch (Base64DecoderException e11) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new RuntimeException(e12);
        } catch (InvalidKeySpecException e13) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e13);
        }
    }

    private static String k(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(f fVar) {
        try {
            this.f90758d.b(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, null);
            if (this.f90758d.a()) {
                fVar.a().a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE);
            } else {
                fVar.a().b(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void m() {
        while (true) {
            f fVarPoll = this.f90763i.poll();
            if (fVarPoll == null) {
                return;
            }
            try {
                Log.i("LicenseChecker", "Calling checkLicense on service for " + fVarPoll.c());
                this.f90755a.e0((long) fVarPoll.b(), fVarPoll.c(), new a(fVarPoll));
                this.f90762h.add(fVarPoll);
            } catch (RemoteException e11) {
                Log.w("LicenseChecker", "RemoteException in checkLicense call.", e11);
                l(fVarPoll);
            }
        }
    }

    public synchronized void f(e eVar) {
        try {
            if (this.f90758d.a()) {
                Log.i("LicenseChecker", "Using cached license response");
                eVar.a(256);
            } else {
                f fVar = new f(this.f90758d, new g(), eVar, i(), this.f90760f, this.f90761g);
                if (this.f90755a == null) {
                    Log.i("LicenseChecker", "Binding to licensing service.");
                    try {
                        if (this.f90757c.bindService(new Intent(new String(mu.a.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="))).setPackage(new String(mu.a.a("Y29tLmFuZHJvaWQudmVuZGluZw=="))), this, 1)) {
                            this.f90763i.offer(fVar);
                        } else {
                            Log.e("LicenseChecker", "Could not bind to service.");
                            l(fVar);
                        }
                    } catch (Base64DecoderException e11) {
                        e11.printStackTrace();
                    } catch (SecurityException unused) {
                        eVar.c(6);
                    }
                } else {
                    this.f90763i.offer(fVar);
                    m();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f90755a = ILicensingService.a.R2(iBinder);
        m();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.f90755a = null;
    }
}
