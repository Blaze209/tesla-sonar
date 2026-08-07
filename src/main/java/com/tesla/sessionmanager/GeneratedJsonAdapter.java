package com.tesla.sessionmanager;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import sc0.b;
import v20.c;

/* JADX INFO: renamed from: com.tesla.sessionmanager.VehicleSessionInfoJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/tesla/sessionmanager/VehicleSessionInfoJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "b", "(Lcom/squareup/moshi/r;Lcom/tesla/sessionmanager/VehicleSessionInfo;)V", "Lcom/squareup/moshi/k$b;", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/h;", "stringAdapter", "", "c", "intAdapter", "Lsc0/b;", DateTokenConverter.CONVERTER_KEY, "domainAdapter", "e", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "f", "Ljava/lang/reflect/Constructor;", "constructorRef", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<VehicleSessionInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<String> stringAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h<Integer> intAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<b> domainAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<String> nullableStringAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile Constructor<VehicleSessionInfo> constructorRef;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("publicKeyHex", "handle", "counter", "clockTime", "epochHex", "epochStartSeconds", "domain", "requestId");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, d1.d(), "publicKeyHex");
        s.j(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.TYPE, d1.d(), "handle");
        s.j(hVarF2, "adapter(...)");
        this.intAdapter = hVarF2;
        h<b> hVarF3 = moshi.f(b.class, d1.d(), "domain");
        s.j(hVarF3, "adapter(...)");
        this.domainAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, d1.d(), "requestId");
        s.j(hVarF4, "adapter(...)");
        this.nullableStringAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VehicleSessionInfo fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        s.k(reader, "reader");
        reader.h();
        int i11 = -1;
        String strFromJson = null;
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        Integer numFromJson3 = null;
        String strFromJson2 = null;
        Integer numFromJson4 = null;
        b bVarFromJson = null;
        String strFromJson3 = null;
        while (true) {
            String str = strFromJson;
            Integer num = numFromJson;
            if (!reader.hasNext()) {
                Integer num2 = numFromJson2;
                reader.j();
                if (i11 == -129) {
                    if (str == null) {
                        throw c.o("publicKeyHex", "publicKeyHex", reader);
                    }
                    if (num == null) {
                        throw c.o("handle", "handle", reader);
                    }
                    int iIntValue = num.intValue();
                    if (num2 == null) {
                        throw c.o("counter", "counter", reader);
                    }
                    Integer num3 = numFromJson3;
                    int iIntValue2 = num2.intValue();
                    if (num3 == null) {
                        throw c.o("clockTime", "clockTime", reader);
                    }
                    Integer num4 = numFromJson4;
                    String str2 = strFromJson2;
                    int iIntValue3 = num3.intValue();
                    if (str2 == null) {
                        throw c.o("epochHex", "epochHex", reader);
                    }
                    if (num4 == null) {
                        throw c.o("epochStartSeconds", "epochStartSeconds", reader);
                    }
                    String str3 = strFromJson3;
                    b bVar = bVarFromJson;
                    int iIntValue4 = num4.intValue();
                    if (bVar != null) {
                        return new VehicleSessionInfo(str, iIntValue, iIntValue2, iIntValue3, str2, iIntValue4, bVar, str3);
                    }
                    throw c.o("domain", "domain", reader);
                }
                Integer num5 = numFromJson3;
                Integer num6 = numFromJson4;
                String str4 = strFromJson3;
                String str5 = strFromJson2;
                b bVar2 = bVarFromJson;
                Constructor<VehicleSessionInfo> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class<?> cls = c.f117643c;
                    Class cls2 = Integer.TYPE;
                    declaredConstructor = VehicleSessionInfo.class.getDeclaredConstructor(String.class, cls2, cls2, cls2, String.class, cls2, b.class, String.class, cls2, cls);
                    this.constructorRef = declaredConstructor;
                    s.j(declaredConstructor, "also(...)");
                }
                if (str == null) {
                    throw c.o("publicKeyHex", "publicKeyHex", reader);
                }
                if (num == null) {
                    throw c.o("handle", "handle", reader);
                }
                if (num2 == null) {
                    throw c.o("counter", "counter", reader);
                }
                if (num5 == null) {
                    throw c.o("clockTime", "clockTime", reader);
                }
                if (str5 == null) {
                    throw c.o("epochHex", "epochHex", reader);
                }
                if (num6 == null) {
                    throw c.o("epochStartSeconds", "epochStartSeconds", reader);
                }
                if (bVar2 == null) {
                    throw c.o("domain", "domain", reader);
                }
                VehicleSessionInfo vehicleSessionInfoNewInstance = declaredConstructor.newInstance(str, num, num2, num5, str5, num6, bVar2, str4, Integer.valueOf(i11), null);
                s.j(vehicleSessionInfoNewInstance, "newInstance(...)");
                return vehicleSessionInfoNewInstance;
            }
            Integer num7 = numFromJson2;
            switch (reader.T(this.options)) {
                case -1:
                    reader.e0();
                    reader.F();
                    numFromJson2 = num7;
                    strFromJson = str;
                    numFromJson = num;
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.x("publicKeyHex", "publicKeyHex", reader);
                    }
                    numFromJson2 = num7;
                    numFromJson = num;
                    break;
                    break;
                case 1:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.x("handle", "handle", reader);
                    }
                    numFromJson2 = num7;
                    strFromJson = str;
                    break;
                    break;
                case 2:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw c.x("counter", "counter", reader);
                    }
                    strFromJson = str;
                    numFromJson = num;
                    break;
                case 3:
                    numFromJson3 = this.intAdapter.fromJson(reader);
                    if (numFromJson3 == null) {
                        throw c.x("clockTime", "clockTime", reader);
                    }
                    numFromJson2 = num7;
                    strFromJson = str;
                    numFromJson = num;
                    break;
                case 4:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.x("epochHex", "epochHex", reader);
                    }
                    numFromJson2 = num7;
                    strFromJson = str;
                    numFromJson = num;
                    break;
                case 5:
                    numFromJson4 = this.intAdapter.fromJson(reader);
                    if (numFromJson4 == null) {
                        throw c.x("epochStartSeconds", "epochStartSeconds", reader);
                    }
                    numFromJson2 = num7;
                    strFromJson = str;
                    numFromJson = num;
                    break;
                case 6:
                    bVarFromJson = this.domainAdapter.fromJson(reader);
                    if (bVarFromJson == null) {
                        throw c.x("domain", "domain", reader);
                    }
                    numFromJson2 = num7;
                    strFromJson = str;
                    numFromJson = num;
                    break;
                case 7:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson2 = num7;
                    strFromJson = str;
                    numFromJson = num;
                    i11 = -129;
                    break;
                default:
                    numFromJson2 = num7;
                    strFromJson = str;
                    numFromJson = num;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(r writer, VehicleSessionInfo value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("publicKeyHex");
        this.stringAdapter.toJson(writer, value_.getPublicKeyHex());
        writer.b0("handle");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getHandle()));
        writer.b0("counter");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getCounter()));
        writer.b0("clockTime");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getClockTime()));
        writer.b0("epochHex");
        this.stringAdapter.toJson(writer, value_.getEpochHex());
        writer.b0("epochStartSeconds");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getEpochStartSeconds()));
        writer.b0("domain");
        this.domainAdapter.toJson(writer, value_.getDomain());
        writer.b0("requestId");
        this.nullableStringAdapter.toJson(writer, value_.getRequestId());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VehicleSessionInfo");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}
