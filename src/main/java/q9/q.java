package q9;

import androidx.media3.common.ParserException;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import java.util.ArrayList;
import java.util.List;
import p7.f0;
import s7.c0;
import w8.i0;

/* JADX INFO: loaded from: classes3.dex */
final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ou.u f105066d = ou.u.e(CoreConstants.COLON_CHAR);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ou.u f105067e = ou.u.e('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f105068a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f105069b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f105070c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f105072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f105073c;

        public a(int i11, long j11, int i12) {
            this.f105071a = i11;
            this.f105072b = j11;
            this.f105073c = i12;
        }
    }

    private void a(w8.q qVar, i0 i0Var) {
        c0 c0Var = new c0(8);
        qVar.readFully(c0Var.f(), 0, 8);
        this.f105070c = c0Var.z() + 8;
        if (c0Var.v() != 1397048916) {
            i0Var.f121323a = 0L;
        } else {
            i0Var.f121323a = qVar.getPosition() - ((long) (this.f105070c - 12));
            this.f105069b = 2;
        }
    }

    private static int b(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return NearbyMessagesStatusCodes.BLUETOOTH_OFF;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", null);
        }
    }

    private void d(w8.q qVar, i0 i0Var) {
        long length = qVar.getLength();
        int i11 = this.f105070c - 20;
        c0 c0Var = new c0(i11);
        qVar.readFully(c0Var.f(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            c0Var.c0(2);
            short sB = c0Var.B();
            if (sB == 2192 || sB == 2816 || sB == 2817 || sB == 2819 || sB == 2820) {
                this.f105068a.add(new a(sB, (length - ((long) this.f105070c)) - ((long) c0Var.z()), c0Var.z()));
            } else {
                c0Var.c0(8);
            }
        }
        if (this.f105068a.isEmpty()) {
            i0Var.f121323a = 0L;
        } else {
            this.f105069b = 3;
            i0Var.f121323a = this.f105068a.get(0).f105072b;
        }
    }

    private void e(w8.q qVar, List<f0.a> list) throws ParserException {
        long position = qVar.getPosition();
        int length = (int) ((qVar.getLength() - qVar.getPosition()) - ((long) this.f105070c));
        c0 c0Var = new c0(length);
        qVar.readFully(c0Var.f(), 0, length);
        for (int i11 = 0; i11 < this.f105068a.size(); i11++) {
            a aVar = this.f105068a.get(i11);
            c0Var.b0((int) (aVar.f105072b - position));
            c0Var.c0(4);
            int iZ = c0Var.z();
            int iB = b(c0Var.J(iZ));
            int i12 = aVar.f105073c - (iZ + 8);
            if (iB == 2192) {
                list.add(f(c0Var, i12));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static l9.c f(c0 c0Var, int i11) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listG = f105067e.g(c0Var.J(i11));
        for (int i12 = 0; i12 < listG.size(); i12++) {
            List<String> listG2 = f105066d.g(listG.get(i12));
            if (listG2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new l9.c.a(Long.parseLong(listG2.get(0)), Long.parseLong(listG2.get(1)), 1 << (Integer.parseInt(listG2.get(2)) - 1)));
            } catch (NumberFormatException e11) {
                throw ParserException.a(null, e11);
            }
        }
        return new l9.c(arrayList);
    }

    public int c(w8.q qVar, i0 i0Var, List<f0.a> list) throws ParserException {
        int i11 = this.f105069b;
        long j11 = 0;
        if (i11 == 0) {
            long length = qVar.getLength();
            if (length != -1 && length >= 8) {
                j11 = length - 8;
            }
            i0Var.f121323a = j11;
            this.f105069b = 1;
        } else if (i11 == 1) {
            a(qVar, i0Var);
        } else if (i11 == 2) {
            d(qVar, i0Var);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(qVar, list);
            i0Var.f121323a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f105068a.clear();
        this.f105069b = 0;
    }
}
