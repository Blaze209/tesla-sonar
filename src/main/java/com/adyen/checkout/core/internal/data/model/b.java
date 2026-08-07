package com.adyen.checkout.core.internal.data.model;

import android.os.Parcelable;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/b;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "a", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b implements Parcelable {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/core/internal/data/model/b;", "T", "", "modelObject", "Lorg/json/JSONObject;", "a", "(Lcom/adyen/checkout/core/internal/data/model/b;)Lorg/json/JSONObject;", "jsonObject", "b", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/internal/data/model/b;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<T extends b> {
        JSONObject a(T modelObject);

        T b(JSONObject jsonObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }
}
