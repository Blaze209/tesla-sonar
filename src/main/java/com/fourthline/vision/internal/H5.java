package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface H5 {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.vision.internal.H5$a$a, reason: collision with other inner class name */
        public static final class C0633a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0633a f37747a = new C0633a();

            private C0633a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0633a);
            }

            public int hashCode() {
                return -168384285;
            }

            public String toString() {
                return "Active";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f37748a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1421761714;
            }

            public String toString() {
                return "Completed";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f37749a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -27410918;
            }

            public String toString() {
                return "Failed";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f37750a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -679265039;
            }

            public String toString() {
                return "Idle";
            }
        }
    }

    C4165c4 getRecognizedBounds();

    a getState();

    void moveToNextStep();

    void resetCurrentStep();

    void restart();

    void start();

    void stop();

    void takeSnapshot();
}
