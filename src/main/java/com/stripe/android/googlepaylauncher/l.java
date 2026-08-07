package com.stripe.android.googlepaylauncher;

import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/l;", "", "Lkotlinx/coroutines/flow/Flow;", "", "isReady", "()Lkotlinx/coroutines/flow/Flow;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f50886a;

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/googlepaylauncher/l$a;", "", "<init>", "()V", "Lcom/stripe/android/googlepaylauncher/b$a;", "b", "Lcom/stripe/android/googlepaylauncher/b$a;", "defaultFactory", "Lcom/stripe/android/googlepaylauncher/e$a;", "c", "Lcom/stripe/android/googlepaylauncher/e$a;", "a", "()Lcom/stripe/android/googlepaylauncher/e$a;", "setGooglePayAvailabilityClientFactory", "(Lcom/stripe/android/googlepaylauncher/e$a;)V", "googlePayAvailabilityClientFactory", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f50886a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final b.a defaultFactory;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static volatile e.a googlePayAvailabilityClientFactory;

        static {
            b.a aVar = new b.a();
            defaultFactory = aVar;
            googlePayAvailabilityClientFactory = aVar;
        }

        private Companion() {
        }

        public final e.a a() {
            return googlePayAvailabilityClientFactory;
        }
    }

    Flow<Boolean> isReady();
}
