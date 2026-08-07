package com.teslamotors.plugins.ble;

import android.os.Build;
import android.os.ParcelUuid;
import java.text.SimpleDateFormat;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f56697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f56698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ParcelUuid f56699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UUID f56700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UUID f56701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final UUID f56702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final UUID f56703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f56704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SimpleDateFormat f56705i;

    static {
        f56697a = Build.VERSION.SDK_INT >= 26;
        f56698b = UUID.fromString("00000211-b2d1-43f0-9b88-960cebf8b91e");
        f56699c = ParcelUuid.fromString("00001122-0000-1000-8000-00805F9B34FB");
        f56700d = UUID.fromString("00000212-b2d1-43f0-9b88-960cebf8b91e");
        f56701e = UUID.fromString("00000213-b2d1-43f0-9b88-960cebf8b91e");
        f56702f = UUID.fromString("00000214-b2d1-43f0-9b88-960cebf8b91e");
        f56703g = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        f56704h = new byte[]{2};
        f56705i = new SimpleDateFormat("MM/dd/yy HH:mm:ss.SSS");
    }
}
