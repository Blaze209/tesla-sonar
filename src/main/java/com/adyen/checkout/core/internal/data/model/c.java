package com.adyen.checkout.core.internal.data.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0005*\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00018\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0015\u001a\u0004\u0018\u00010\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/c;", "", "<init>", "()V", "Lcom/adyen/checkout/core/internal/data/model/b;", "T", "Lorg/json/JSONObject;", "jsonObject", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "serializer", "a", "(Lorg/json/JSONObject;Lcom/adyen/checkout/core/internal/data/model/b$a;)Lcom/adyen/checkout/core/internal/data/model/b;", "Lorg/json/JSONArray;", "jsonArray", "", "b", "(Lorg/json/JSONArray;Lcom/adyen/checkout/core/internal/data/model/b$a;)Ljava/util/List;", "modelObject", "c", "(Lcom/adyen/checkout/core/internal/data/model/b;Lcom/adyen/checkout/core/internal/data/model/b$a;)Lorg/json/JSONObject;", "modelList", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lcom/adyen/checkout/core/internal/data/model/b$a;)Lorg/json/JSONArray;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f19763a = new c();

    private c() {
    }

    public static final <T extends b> T a(JSONObject jsonObject, b.a<T> serializer) {
        s.k(serializer, "serializer");
        if (jsonObject == null) {
            return null;
        }
        return (T) serializer.b(jsonObject);
    }

    public static final <T extends b> List<T> b(JSONArray jsonArray, b.a<T> serializer) {
        s.k(serializer, "serializer");
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(serializer.b(jSONObjectOptJSONObject));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final <T extends b> JSONObject c(T modelObject, b.a<T> serializer) {
        s.k(serializer, "serializer");
        if (modelObject == null) {
            return null;
        }
        return serializer.a(modelObject);
    }

    public static final <T extends b> JSONArray d(List<? extends T> modelList, b.a<T> serializer) {
        s.k(serializer, "serializer");
        if (modelList == null || modelList.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends T> it = modelList.iterator();
        while (it.hasNext()) {
            jSONArray.put(serializer.a(it.next()));
        }
        return jSONArray;
    }
}
