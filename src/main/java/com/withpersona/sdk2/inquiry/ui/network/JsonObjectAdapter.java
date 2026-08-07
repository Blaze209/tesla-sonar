package com.withpersona.sdk2.inquiry.ui.network;

import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.x;
import java.util.Map;
import okio.h;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@p013kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/JsonObjectAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/r;", "writer", "Lorg/json/JSONObject;", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lorg/json/JSONObject;)V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lorg/json/JSONObject;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonObjectAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonObjectAdapter f58735a = new JsonObjectAdapter();

    private JsonObjectAdapter() {
    }

    @f
    public final JSONObject fromJson(k reader) {
        s.k(reader, "reader");
        Object objJ = reader.J();
        Map map = objJ instanceof Map ? (Map) objJ : null;
        if (map == null) {
            return null;
        }
        try {
            return new JSONObject(map);
        } catch (JSONException unused) {
            return null;
        }
    }

    @x
    public final void toJson(r writer, JSONObject value) {
        s.k(writer, "writer");
        if (value != null) {
            h hVar = new h();
            String string = value.toString();
            s.j(string, "toString(...)");
            writer.H0(hVar.l2(string));
        }
    }
}
