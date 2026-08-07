package ha;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f72196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f72197c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1506a f72198a;

    /* JADX INFO: renamed from: ha.a$a, reason: collision with other inner class name */
    private interface InterfaceC1506a {

        /* JADX INFO: renamed from: ha.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC1507a {
            InterfaceC1507a a(int i11);

            InterfaceC1507a b(int i11);

            InterfaceC1506a build();

            InterfaceC1507a c(int i11);
        }

        int a();

        int b();

        int getContentType();

        int j();
    }

    private static class b implements InterfaceC1506a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AudioAttributes f72199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72200b;

        /* JADX INFO: renamed from: ha.a$b$a, reason: collision with other inner class name */
        static class C1508a implements InterfaceC1506a.InterfaceC1507a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final AudioAttributes.Builder f72201a = new AudioAttributes.Builder();

            C1508a() {
            }

            @Override // ha.a.InterfaceC1506a.InterfaceC1507a
            public InterfaceC1506a build() {
                return new b(this.f72201a.build());
            }

            @Override // ha.a.InterfaceC1506a.InterfaceC1507a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C1508a c(int i11) {
                this.f72201a.setContentType(i11);
                return this;
            }

            @Override // ha.a.InterfaceC1506a.InterfaceC1507a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public C1508a a(int i11) {
                this.f72201a.setFlags(i11);
                return this;
            }

            @Override // ha.a.InterfaceC1506a.InterfaceC1507a
            @SuppressLint({"WrongConstant"})
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public C1508a b(int i11) {
                if (i11 == 16) {
                    i11 = 12;
                }
                this.f72201a.setUsage(i11);
                return this;
            }
        }

        b(AudioAttributes audioAttributes) {
            this(audioAttributes, -1);
        }

        @Override // ha.a.InterfaceC1506a
        public int a() {
            int i11 = this.f72200b;
            return i11 != -1 ? i11 : a.e(j(), b());
        }

        @Override // ha.a.InterfaceC1506a
        public int b() {
            return ((AudioAttributes) s7.a.f(this.f72199a)).getUsage();
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f72199a, ((b) obj).f72199a);
            }
            return false;
        }

        @Override // ha.a.InterfaceC1506a
        public int getContentType() {
            return ((AudioAttributes) s7.a.f(this.f72199a)).getContentType();
        }

        public int hashCode() {
            return ((AudioAttributes) s7.a.f(this.f72199a)).hashCode();
        }

        @Override // ha.a.InterfaceC1506a
        public int j() {
            return ((AudioAttributes) s7.a.f(this.f72199a)).getFlags();
        }

        public String toString() {
            return "AudioAttributesCompat: audioattributes=" + this.f72199a;
        }

        b(AudioAttributes audioAttributes, int i11) {
            this.f72199a = audioAttributes;
            this.f72200b = i11;
        }
    }

    private static class c extends b {

        /* JADX INFO: renamed from: ha.a$c$a, reason: collision with other inner class name */
        static class C1509a extends b.C1508a {
            C1509a() {
            }

            @Override // ha.a.b.C1508a, ha.a.InterfaceC1506a.InterfaceC1507a
            public InterfaceC1506a build() {
                return new c(this.f72201a.build());
            }

            @Override // ha.a.b.C1508a
            @SuppressLint({"WrongConstant"})
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C1509a b(int i11) {
                this.f72201a.setUsage(i11);
                return this;
            }
        }

        c(AudioAttributes audioAttributes) {
            super(audioAttributes, -1);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InterfaceC1506a.InterfaceC1507a f72202a;

        public d() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f72202a = new c.C1509a();
            } else {
                this.f72202a = new b.C1508a();
            }
        }

        public a a() {
            return new a(this.f72202a.build());
        }

        public d b(int i11) {
            this.f72202a.c(i11);
            return this;
        }

        public d c(int i11) {
            this.f72202a.a(i11);
            return this;
        }

        public d d(int i11) {
            this.f72202a.b(i11);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72196b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f72197c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    a(InterfaceC1506a interfaceC1506a) {
        this.f72198a = interfaceC1506a;
    }

    static int e(int i11, int i12) {
        if ((i11 & 1) == 1) {
            return 7;
        }
        if ((i11 & 4) == 4) {
            return 6;
        }
        switch (i12) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static a f(Object obj) {
        return Build.VERSION.SDK_INT >= 26 ? new a(new c((AudioAttributes) obj)) : new a(new b((AudioAttributes) obj));
    }

    public int a() {
        return this.f72198a.getContentType();
    }

    public int b() {
        return this.f72198a.j();
    }

    public int c() {
        return this.f72198a.a();
    }

    public int d() {
        return this.f72198a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f72198a.equals(((a) obj).f72198a);
        }
        return false;
    }

    public int hashCode() {
        return this.f72198a.hashCode();
    }

    public String toString() {
        return this.f72198a.toString();
    }
}
