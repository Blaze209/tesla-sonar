package com.stripe.android.financialconnections.model;

import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/model/f0;", "Landroid/os/Parcelable;", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "Companion", "a", "Lcom/stripe/android/financialconnections/model/c;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p(with = n50.e.class)
public abstract class f0 implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/f0$a;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/f0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<f0> serializer() {
            return n50.e.f93348c;
        }

        private Companion() {
        }
    }

    public /* synthetic */ f0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    private f0() {
    }
}
