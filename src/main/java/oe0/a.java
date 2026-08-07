package oe0;

import com.squareup.wire.ProtoAdapter;
import expo.modules.contacts.Columns;
import fc0.u5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import ke0.i;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"Loe0/a;", "", "<init>", "()V", "Lxc0/a;", "", "a", "(Lxc0/a;)Ljava/lang/String;", "e", "(Ljava/lang/String;)Lxc0/a;", "Lorg/json/JSONObject;", "vin", "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Lxc0/a;", "Lke0/i;", "origin", "", "skipToParseProtoData", "c", "(Lorg/json/JSONObject;Lke0/i;Z)Lxc0/a;", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "Ljava/nio/charset/Charset;", "encodeCharset", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f97213a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Charset encodeCharset = StandardCharsets.ISO_8859_1;

    private a() {
    }

    public static /* synthetic */ xc0.a d(a aVar, JSONObject jSONObject, i iVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return aVar.c(jSONObject, iVar, z11);
    }

    public final String a(xc0.a aVar) {
        s.k(aVar, "<this>");
        byte[] bArrEncode = xc0.a.f123224m.encode(aVar);
        Charset encodeCharset2 = encodeCharset;
        s.j(encodeCharset2, "encodeCharset");
        return new String(bArrEncode, encodeCharset2);
    }

    public final xc0.a b(JSONObject jSONObject, String vin) {
        u5 u5Var;
        s.k(jSONObject, "<this>");
        s.k(vin, "vin");
        try {
            i iVar = i.VEHICLE_DATA_FETCH;
            ke0.b bVar = ke0.b.f85979a;
            u5 u5VarD = bVar.d(jSONObject, vin, iVar);
            u5 u5VarC = bVar.c(jSONObject, vin, iVar);
            if (u5VarC == null || !wb0.e.N(u5VarC, u5VarD, false, 2, null)) {
                me0.c.a().j("Server vehicle_data/JSON fresher");
                u5Var = u5VarD;
            } else {
                me0.c.a().j("Server cached_data fresher");
                u5Var = u5VarC;
            }
            String strOptString = jSONObject.optString("id");
            s.j(strOptString, "optString(...)");
            boolean zOptBoolean = jSONObject.optBoolean("is_predelivery");
            String strOptString2 = jSONObject.optString("snapshotConfigHash");
            s.j(strOptString2, "optString(...)");
            String strOptString3 = jSONObject.optString(Columns.DISPLAY_NAME);
            s.j(strOptString3, "optString(...)");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("granular_access");
            boolean zOptBoolean2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("hide_private") : false;
            String strOptString4 = jSONObject.optString("vin");
            s.h(strOptString4);
            if (t.y0(strOptString4)) {
                strOptString4 = null;
            }
            if (strOptString4 == null) {
                strOptString4 = u5Var != null ? wb0.e.v(u5Var) : null;
                if (strOptString4 == null) {
                    strOptString4 = "";
                }
            }
            return new xc0.a(strOptString, strOptString2, zOptBoolean, strOptString3, u5Var, null, null, zOptBoolean2, strOptString4, null, null, null, 3680, null);
        } catch (Exception e11) {
            me0.c.a().d("parseWidgetVehicleFromJson failed", e11);
            return null;
        }
    }

    public final xc0.a c(JSONObject jSONObject, i origin, boolean z11) {
        u5 u5Var;
        s.k(jSONObject, "<this>");
        s.k(origin, "origin");
        try {
            String strOptString = jSONObject.optString("vin");
            s.h(strOptString);
            if (t.y0(strOptString)) {
                strOptString = null;
            }
            if (!z11 || strOptString == null) {
                u5 u5VarE = ke0.b.f85979a.e(jSONObject, origin);
                if (strOptString == null) {
                    strOptString = u5VarE != null ? wb0.e.v(u5VarE) : null;
                    if (strOptString == null) {
                        strOptString = "";
                    }
                }
                u5Var = u5VarE;
            } else {
                u5Var = null;
            }
            String str = strOptString;
            String strOptString2 = jSONObject.optString("id");
            s.j(strOptString2, "optString(...)");
            boolean zOptBoolean = jSONObject.optBoolean("is_predelivery");
            String strOptString3 = jSONObject.optString("snapshotConfigHash");
            s.j(strOptString3, "optString(...)");
            String strOptString4 = jSONObject.optString(Columns.DISPLAY_NAME);
            s.j(strOptString4, "optString(...)");
            return new xc0.a(strOptString2, strOptString3, zOptBoolean, strOptString4, u5Var, null, null, false, str, null, null, null, 3808, null);
        } catch (Exception e11) {
            me0.c.a().d("parseWidgetVehicleFromJson failed", e11);
            return null;
        }
    }

    public final xc0.a e(String str) {
        s.k(str, "<this>");
        try {
            ProtoAdapter<xc0.a> protoAdapter = xc0.a.f123224m;
            Charset encodeCharset2 = encodeCharset;
            s.j(encodeCharset2, "encodeCharset");
            byte[] bytes = str.getBytes(encodeCharset2);
            s.j(bytes, "getBytes(...)");
            return protoAdapter.decode(bytes);
        } catch (IOException e11) {
            me0.c.a().d("decode AppVehicle failed", e11);
            return null;
        }
    }
}
