package sb;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import tb.NetworkRequestCompat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lsb/c2;", "", "<init>", "()V", "Landroidx/work/r0$c;", "state", "", "k", "(Landroidx/work/r0$c;)I", "value", "g", "(I)Landroidx/work/r0$c;", "Landroidx/work/a;", "backoffPolicy", "a", "(Landroidx/work/a;)I", DateTokenConverter.CONVERTER_KEY, "(I)Landroidx/work/a;", "Landroidx/work/a0;", "networkType", "h", "(Landroidx/work/a0;)I", "e", "(I)Landroidx/work/a0;", "Landroidx/work/i0;", "policy", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/work/i0;)I", "f", "(I)Landroidx/work/i0;", "", "Landroidx/work/e$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", "bytes", "b", "([B)Ljava/util/Set;", "Ltb/u;", "l", "([B)Ltb/u;", "requestCompat", "c", "(Ltb/u;)[B", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f110782a = new c2();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f110784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f110785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f110786d;

        static {
            int[] iArr = new int[androidx.work.r0.c.values().length];
            try {
                iArr[androidx.work.r0.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.work.r0.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.work.r0.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.work.r0.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.work.r0.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.work.r0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f110783a = iArr;
            int[] iArr2 = new int[androidx.work.a.values().length];
            try {
                iArr2[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f110784b = iArr2;
            int[] iArr3 = new int[androidx.work.a0.values().length];
            try {
                iArr3[androidx.work.a0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[androidx.work.a0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[androidx.work.a0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[androidx.work.a0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[androidx.work.a0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f110785c = iArr3;
            int[] iArr4 = new int[androidx.work.i0.values().length];
            try {
                iArr4[androidx.work.i0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[androidx.work.i0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f110786d = iArr4;
        }
    }

    private c2() {
    }

    public static final int a(androidx.work.a backoffPolicy) {
        p013kotlin.jvm.internal.s.k(backoffPolicy, "backoffPolicy");
        int i11 = a.f110784b[backoffPolicy.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Set<androidx.work.e.c> b(byte[] bytes) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i11 = objectInputStream.readInt();
                    for (int i12 = 0; i12 < i11; i12++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z11 = objectInputStream.readBoolean();
                        p013kotlin.jvm.internal.s.h(uri);
                        linkedHashSet.add(new androidx.work.e.c(uri, z11));
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    sn0.b.a(objectInputStream, null);
                    jn0.h0 h0Var2 = jn0.h0.f84049a;
                    sn0.b.a(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    sn0.b.a(byteArrayInputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static final byte[] c(NetworkRequestCompat requestCompat) {
        p013kotlin.jvm.internal.s.k(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestB = requestCompat.b();
        if (networkRequestB == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrC = tb.v.c(networkRequestB);
                int[] iArrB = tb.v.b(networkRequestB);
                objectOutputStream.writeInt(iArrC.length);
                for (int i11 : iArrC) {
                    objectOutputStream.writeInt(i11);
                }
                objectOutputStream.writeInt(iArrB.length);
                for (int i12 : iArrB) {
                    objectOutputStream.writeInt(i12);
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
                sn0.b.a(objectOutputStream, null);
                sn0.b.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                sn0.b.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    public static final androidx.work.a d(int value) {
        if (value == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (value == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    public static final androidx.work.a0 e(int value) {
        if (value == 0) {
            return androidx.work.a0.NOT_REQUIRED;
        }
        if (value == 1) {
            return androidx.work.a0.CONNECTED;
        }
        if (value == 2) {
            return androidx.work.a0.UNMETERED;
        }
        if (value == 3) {
            return androidx.work.a0.NOT_ROAMING;
        }
        if (value == 4) {
            return androidx.work.a0.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return androidx.work.a0.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    public static final androidx.work.i0 f(int value) {
        if (value == 0) {
            return androidx.work.i0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return androidx.work.i0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    public static final androidx.work.r0.c g(int value) {
        if (value == 0) {
            return androidx.work.r0.c.ENQUEUED;
        }
        if (value == 1) {
            return androidx.work.r0.c.RUNNING;
        }
        if (value == 2) {
            return androidx.work.r0.c.SUCCEEDED;
        }
        if (value == 3) {
            return androidx.work.r0.c.FAILED;
        }
        if (value == 4) {
            return androidx.work.r0.c.BLOCKED;
        }
        if (value == 5) {
            return androidx.work.r0.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    public static final int h(androidx.work.a0 networkType) {
        p013kotlin.jvm.internal.s.k(networkType, "networkType");
        int i11 = a.f110785c[networkType.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        if (i11 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.a0.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int i(androidx.work.i0 policy) {
        p013kotlin.jvm.internal.s.k(policy, "policy");
        int i11 = a.f110786d[policy.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final byte[] j(Set<androidx.work.e.c> triggers) {
        p013kotlin.jvm.internal.s.k(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (androidx.work.e.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.getUri().toString());
                    objectOutputStream.writeBoolean(cVar.getIsTriggeredForDescendants());
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
                sn0.b.a(objectOutputStream, null);
                sn0.b.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                sn0.b.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    public static final int k(androidx.work.r0.c state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        switch (a.f110783a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final NetworkRequestCompat l(byte[] bytes) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i11 = objectInputStream.readInt();
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr[i12] = objectInputStream.readInt();
                }
                int i13 = objectInputStream.readInt();
                int[] iArr2 = new int[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    iArr2[i14] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatB = tb.r.f113096a.b(iArr2, iArr);
                sn0.b.a(objectInputStream, null);
                sn0.b.a(byteArrayInputStream, null);
                return networkRequestCompatB;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                sn0.b.a(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }
}
