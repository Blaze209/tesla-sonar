package com.fourthline.vision.internal;

import android.net.Uri;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Z5 {

    public static final class a extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f38124a;

        public a(Throwable th2) {
            super(th2);
            this.f38124a = th2;
        }

        public static /* synthetic */ a copy$default(a aVar, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = aVar.f38124a;
            }
            return aVar.copy(th2);
        }

        public final Throwable component1() {
            return this.f38124a;
        }

        public final a copy(Throwable th2) {
            return new a(th2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f38124a, ((a) obj).f38124a);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f38124a;
        }

        public int hashCode() {
            Throwable th2 = this.f38124a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RecordingFailed(cause=" + this.f38124a + ")";
        }
    }

    Object stop(Continuation<? super Uri> continuation);
}
