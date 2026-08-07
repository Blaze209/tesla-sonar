package com.google.android.vending.expansion.downloader.impl;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Messenger;
import androidx.core.app.o;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes5.dex */
public class c implements ku.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f43229m = -908767821;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43230a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f43231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotificationManager f43232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f43233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ku.e f43234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o.e f43235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o.e f43236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o.e f43237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f43238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f43239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ku.a f43240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PendingIntent f43241l;

    c(Context context, CharSequence charSequence) {
        this.f43231b = context;
        this.f43238i = charSequence;
        this.f43232c = (NotificationManager) context.getSystemService("notification");
        this.f43235f = new o.e(context);
        this.f43236g = new o.e(context);
        this.f43235f.A(-1);
        this.f43235f.g(ReactProgressBarViewManager.PROP_PROGRESS);
        this.f43236g.A(-1);
        this.f43236g.g(ReactProgressBarViewManager.PROP_PROGRESS);
        this.f43237h = this.f43236g;
    }

    public void a() {
        ku.e eVar = this.f43234e;
        if (eVar != null) {
            eVar.onDownloadStateChanged(this.f43230a);
        }
    }

    public void b(PendingIntent pendingIntent) {
        this.f43236g.k(pendingIntent);
        this.f43235f.k(pendingIntent);
        this.f43241l = pendingIntent;
    }

    public void c(Messenger messenger) {
        ku.e eVarA = ku.b.a(messenger);
        this.f43234e = eVarA;
        ku.a aVar = this.f43240k;
        if (aVar != null) {
            eVarA.onDownloadProgress(aVar);
        }
        int i11 = this.f43230a;
        if (i11 != -1) {
            this.f43234e.onDownloadStateChanged(i11);
        }
    }

    @Override // ku.e
    public void onDownloadProgress(ku.a aVar) {
        this.f43240k = aVar;
        ku.e eVar = this.f43234e;
        if (eVar != null) {
            eVar.onDownloadProgress(aVar);
        }
        long j11 = aVar.f89385a;
        if (j11 <= 0) {
            this.f43236g.H(this.f43233d);
            this.f43236g.D(R.drawable.stat_sys_download);
            this.f43236g.m(this.f43233d);
            this.f43236g.l(this.f43239j);
            this.f43237h = this.f43236g;
        } else {
            this.f43235f.B((int) j11, (int) aVar.f89386b, false);
            this.f43235f.l(ku.d.d(aVar.f89386b, aVar.f89385a));
            this.f43235f.D(R.drawable.stat_sys_download);
            this.f43235f.H(((Object) this.f43238i) + ": " + this.f43239j);
            this.f43235f.m(this.f43238i);
            this.f43235f.j(this.f43231b.getString(org.godotengine.godot.R.string.time_remaining_notification, ku.d.i(aVar.f89387c)));
            this.f43237h = this.f43235f;
        }
        this.f43232c.notify(f43229m, this.f43237h.c());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    @Override // ku.e
    public void onDownloadStateChanged(int i11) {
        int iE;
        boolean z11;
        ku.e eVar = this.f43234e;
        if (eVar != null) {
            eVar.onDownloadStateChanged(i11);
        }
        if (i11 != this.f43230a) {
            this.f43230a = i11;
            if (i11 == 1 || this.f43241l == null) {
                return;
            }
            int i12 = R.drawable.stat_sys_warning;
            if (i11 != 0) {
                if (i11 == 7) {
                    iE = ku.d.e(i11);
                    z11 = false;
                    i12 = 17301634;
                } else if (i11 == 2 || i11 == 3) {
                    iE = ku.d.e(i11);
                    z11 = true;
                    i12 = 17301634;
                } else {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            switch (i11) {
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                    iE = ku.d.e(i11);
                                    break;
                                default:
                                    iE = ku.d.e(i11);
                                    break;
                            }
                        }
                        iE = ku.d.e(i11);
                        z11 = false;
                        i12 = 17301634;
                    } else {
                        iE = ku.d.e(i11);
                        i12 = R.drawable.stat_sys_download;
                    }
                    z11 = true;
                }
                this.f43239j = this.f43231b.getString(iE);
                this.f43233d = this.f43238i;
                this.f43237h.H(((Object) this.f43238i) + ": " + this.f43239j);
                this.f43237h.D(i12);
                this.f43237h.m(this.f43233d);
                this.f43237h.l(this.f43239j);
                if (z11) {
                    this.f43237h.y(true);
                } else {
                    this.f43237h.y(false);
                    this.f43237h.f(true);
                }
                this.f43232c.notify(f43229m, this.f43237h.c());
            }
            iE = org.godotengine.godot.R.string.state_unknown;
            z11 = false;
            this.f43239j = this.f43231b.getString(iE);
            this.f43233d = this.f43238i;
            this.f43237h.H(((Object) this.f43238i) + ": " + this.f43239j);
            this.f43237h.D(i12);
            this.f43237h.m(this.f43233d);
            this.f43237h.l(this.f43239j);
            if (z11) {
                this.f43237h.y(true);
            } else {
                this.f43237h.y(false);
                this.f43237h.f(true);
            }
            this.f43232c.notify(f43229m, this.f43237h.c());
        }
    }

    @Override // ku.e
    public void onServiceConnected(Messenger messenger) {
    }
}
