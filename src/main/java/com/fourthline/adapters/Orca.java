package com.fourthline.adapters;

import com.fourthline.orca.OrcaKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/fourthline/adapters/Orca;", "", "<init>", "()V", "Ljn0/h0;", "abort", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Orca {
    public static final Orca INSTANCE = new Orca();

    private Orca() {
    }

    public final void abort() {
        OrcaKt.abort(com.fourthline.orca.Orca.INSTANCE);
    }
}
