package com.withpersona.sdk2.inquiry.steps.ui.network;

import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/NumberAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/k;", "reader", "", "fromJson", "(Lcom/squareup/moshi/k;)Ljava/lang/Number;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Ljava/lang/Number;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumberAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NumberAdapter f58692a = new NumberAdapter();

    private NumberAdapter() {
    }

    @f
    public final Number fromJson(k reader) {
        s.k(reader, "reader");
        Object objJ = reader.J();
        Number number = objJ instanceof Number ? (Number) objJ : null;
        if (number instanceof Double) {
            return Double.compare(number.doubleValue(), (double) ((int) number.doubleValue())) == 0 ? Integer.valueOf((int) number.doubleValue()) : number;
        }
        if (number instanceof Integer) {
            return number;
        }
        return null;
    }

    @x
    public final void toJson(r writer, Number value) {
        s.k(writer, "writer");
    }
}
