package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3777rk {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rk$a */
    public interface a extends InterfaceC3777rk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rk$a$a, reason: collision with other inner class name */
        public static final class C0608a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final E3 f35084a;

            public C0608a(E3 buttonState) {
                p013kotlin.jvm.internal.s.k(buttonState, "buttonState");
                this.f35084a = buttonState;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3777rk.a
            public a a(boolean z11) {
                return b.a(this, z11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0608a) && p013kotlin.jvm.internal.s.f(this.f35084a, ((C0608a) obj).f35084a);
            }

            public int hashCode() {
                return this.f35084a.hashCode();
            }

            public String toString() {
                return "Back(buttonState=" + this.f35084a + ")";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3777rk
            public E3 a() {
                return this.f35084a;
            }

            public /* synthetic */ C0608a(E3 e11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i11 & 1) != 0) {
                    e11 = new E3(QA.f27433a.a(R.string.shared_button_back, R.string.shared_button_back_accessibility), false, false, 6, null);
                }
                this(e11);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rk$a$b */
        public static final class b {
            public static a a(a aVar, boolean z11) {
                if (aVar instanceof C0608a) {
                    return new C0608a(E3.a(((C0608a) aVar).a(), null, z11, false, 5, null));
                }
                if (aVar instanceof c) {
                    return new c(E3.a(((c) aVar).a(), null, z11, false, 5, null));
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rk$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final E3 f35085a;

            public c(E3 buttonState) {
                p013kotlin.jvm.internal.s.k(buttonState, "buttonState");
                this.f35085a = buttonState;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3777rk.a
            public a a(boolean z11) {
                return b.a(this, z11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f35085a, ((c) obj).f35085a);
            }

            public int hashCode() {
                return this.f35085a.hashCode();
            }

            public String toString() {
                return "Exit(buttonState=" + this.f35085a + ")";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3777rk
            public E3 a() {
                return this.f35085a;
            }

            public /* synthetic */ c(E3 e11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i11 & 1) != 0) {
                    e11 = new E3(QA.a.a(QA.f27433a, R.string.shared_button_exit, 0, 2, null), false, false, 6, null);
                }
                this(e11);
            }

            public c(boolean z11) {
                this(new E3(QA.a.a(QA.f27433a, R.string.shared_button_exit, 0, 2, null), z11, false, 4, null));
            }
        }

        a a(boolean z11);
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rk$b */
    public static final class b implements InterfaceC3777rk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final E3 f35086a;

        public b(E3 buttonState) {
            p013kotlin.jvm.internal.s.k(buttonState, "buttonState");
            this.f35086a = buttonState;
        }

        public final b a(E3 buttonState) {
            p013kotlin.jvm.internal.s.k(buttonState, "buttonState");
            return new b(buttonState);
        }

        public final b b(boolean z11) {
            return new b(E3.a(a(), null, z11, false, 5, null));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35086a, ((b) obj).f35086a);
        }

        public int hashCode() {
            return this.f35086a.hashCode();
        }

        public String toString() {
            return "Next(buttonState=" + this.f35086a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3777rk
        public E3 a() {
            return this.f35086a;
        }

        public /* synthetic */ b(E3 e11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 1) != 0) {
                e11 = new E3(QA.a.a(QA.f27433a, R.string.shared_button_continue, 0, 2, null), false, false, 6, null);
            }
            this(e11);
        }

        public final b a(boolean z11, boolean z12) {
            return new b(E3.a(a(), null, z11, z12, 1, null));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(QA text) {
            this(new E3(text, false, false, 6, null));
            p013kotlin.jvm.internal.s.k(text, "text");
        }

        public b(boolean z11) {
            this(new E3(QA.a.a(QA.f27433a, R.string.shared_button_continue, 0, 2, null), z11, false, 4, null));
        }

        public b(boolean z11, boolean z12) {
            this(new E3(QA.a.a(QA.f27433a, R.string.shared_button_continue, 0, 2, null), z11, z12));
        }
    }

    E3 a();
}
