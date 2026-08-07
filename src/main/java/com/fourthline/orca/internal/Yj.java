package com.fourthline.orca.internal;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface Yj {

    public static final class a implements Yj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f29890a;

        public a(File file) {
            p013kotlin.jvm.internal.s.k(file, "file");
            this.f29890a = file;
        }

        public final File a() {
            return this.f29890a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f29890a, ((a) obj).f29890a);
        }

        public int hashCode() {
            return this.f29890a.hashCode();
        }

        public String toString() {
            return "FromLocalFile(file=" + this.f29890a + ")";
        }
    }

    public static final class b implements Yj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29891a;

        public b(int i11) {
            this.f29891a = i11;
        }

        public final int a() {
            return this.f29891a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f29891a == ((b) obj).f29891a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29891a);
        }

        public String toString() {
            return "FromRawResources(animationRes=" + this.f29891a + ")";
        }
    }
}
