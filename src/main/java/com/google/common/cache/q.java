package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
abstract class q extends Number {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final ThreadLocal<int[]> f43492d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Random f43493e = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f43494f = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Unsafe f43495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f43496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f43497i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile transient b[] f43498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile transient long f43499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile transient int f43500c;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Unsafe f43501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f43502c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile long f43503a;

        static {
            try {
                Unsafe unsafeF = q.f();
                f43501b = unsafeF;
                f43502c = unsafeF.objectFieldOffset(b.class.getDeclaredField("a"));
            } catch (Exception e11) {
                throw new Error(e11);
            }
        }

        b(long j11) {
            this.f43503a = j11;
        }

        final boolean a(long j11, long j12) {
            return f43501b.compareAndSwapLong(this, f43502c, j11, j12);
        }
    }

    static {
        try {
            Unsafe unsafeF = f();
            f43495g = unsafeF;
            f43496h = unsafeF.objectFieldOffset(q.class.getDeclaredField("b"));
            f43497i = unsafeF.objectFieldOffset(q.class.getDeclaredField("c"));
        } catch (Exception e11) {
            throw new Error(e11);
        }
    }

    q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe f() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    final boolean c(long j11, long j12) {
        return f43495g.compareAndSwapLong(this, f43496h, j11, j12);
    }

    final boolean d() {
        return f43495g.compareAndSwapInt(this, f43497i, 0, 1);
    }

    abstract long e(long j11, long j12);

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    final void g(long j11, int[] iArr, boolean z11) {
        int iNextInt;
        int[] iArr2;
        boolean z12;
        int length;
        boolean z13;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            f43492d.set(iArr2);
            iNextInt = f43493e.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        boolean z14 = false;
        int i11 = iNextInt;
        boolean z15 = z11;
        while (true) {
            b[] bVarArr = this.f43498a;
            if (bVarArr != null && (length = bVarArr.length) > 0) {
                b bVar = bVarArr[(length - 1) & i11];
                if (bVar == null) {
                    if (this.f43500c == 0) {
                        b bVar2 = new b(j11);
                        if (this.f43500c == 0 && d()) {
                            try {
                                b[] bVarArr2 = this.f43498a;
                                if (bVarArr2 == null || (length2 = bVarArr2.length) <= 0) {
                                    z13 = false;
                                } else {
                                    int i12 = (length2 - 1) & i11;
                                    if (bVarArr2[i12] == null) {
                                        bVarArr2[i12] = bVar2;
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                }
                                this.f43500c = 0;
                                if (z13) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.f43500c = 0;
                                throw th2;
                            }
                        }
                    }
                    z14 = false;
                    int i13 = i11 ^ (i11 << 13);
                    int i14 = i13 ^ (i13 >>> 17);
                    i11 = i14 ^ (i14 << 5);
                    iArr2[0] = i11;
                } else {
                    if (z15) {
                        long j12 = bVar.f43503a;
                        if (bVar.a(j12, e(j12, j11))) {
                            return;
                        }
                        if (length >= f43494f || this.f43498a != bVarArr) {
                            z14 = false;
                        } else if (!z14) {
                            z14 = true;
                        } else if (this.f43500c == 0 && d()) {
                            try {
                                if (this.f43498a == bVarArr) {
                                    b[] bVarArr3 = new b[length << 1];
                                    for (int i15 = 0; i15 < length; i15++) {
                                        bVarArr3[i15] = bVarArr[i15];
                                    }
                                    this.f43498a = bVarArr3;
                                }
                                this.f43500c = 0;
                                z14 = false;
                            } catch (Throwable th3) {
                                this.f43500c = 0;
                                throw th3;
                            }
                        }
                    } else {
                        z15 = true;
                    }
                    int i16 = i11 ^ (i11 << 13);
                    int i17 = i16 ^ (i16 >>> 17);
                    i11 = i17 ^ (i17 << 5);
                    iArr2[0] = i11;
                }
            } else if (this.f43500c == 0 && this.f43498a == bVarArr && d()) {
                try {
                    if (this.f43498a == bVarArr) {
                        b[] bVarArr4 = new b[2];
                        bVarArr4[i11 & 1] = new b(j11);
                        this.f43498a = bVarArr4;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f43500c = 0;
                    if (z12) {
                        return;
                    }
                } catch (Throwable th4) {
                    this.f43500c = 0;
                    throw th4;
                }
            } else {
                long j13 = this.f43499b;
                if (c(j13, e(j13, j11))) {
                    return;
                }
            }
        }
    }
}
