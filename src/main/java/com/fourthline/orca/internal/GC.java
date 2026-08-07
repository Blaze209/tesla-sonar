package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface GC extends JD {

    public static final class a implements GC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25927a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1817912054;
        }

        public String toString() {
            return "OnExitTriggered";
        }
    }

    public static final class b implements GC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25928a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -220802954;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    public static final class c implements GC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25929a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1511660722;
        }

        public String toString() {
            return "OnSystemBackTriggered";
        }
    }
}
