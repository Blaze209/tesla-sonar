package com.teslamotors.plugins.ble;

import android.content.Context;
import android.os.ParcelUuid;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import expo.modules.interfaces.permissions.PermissionsResponse;
import fc0.u5;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006$"}, d2 = {"Lcom/teslamotors/plugins/ble/z0;", "", "<init>", "()V", "", "vin", "Landroid/os/ParcelUuid;", "a", "(Ljava/lang/String;)Landroid/os/ParcelUuid;", "", "bytes", "Ljava/util/UUID;", "b", "([B)Ljava/util/UUID;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "accountEmail", "", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/teslamotors/plugins/ble/g0;", "controller", "Lhf0/m;", PermissionsResponse.STATUS_KEY, "c", "(Lcom/teslamotors/plugins/ble/g0;Lhf0/m;)Z", "", "allVINs", "isScanningForever", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Z)Z", "f", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f57036a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = b.f56733a.p("PhoneKeyUtils");

    private z0() {
    }

    public static final ParcelUuid a(String vin) {
        if (vin == null) {
            return null;
        }
        Charset US_ASCII = StandardCharsets.US_ASCII;
        p013kotlin.jvm.internal.s.j(US_ASCII, "US_ASCII");
        byte[] bytes = vin.getBytes(US_ASCII);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        if (bytes.length != 17) {
            return null;
        }
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 1, bArr, 0, 16);
        return ParcelUuid.fromString(f57036a.b(bArr).toString());
    }

    private final UUID b(byte[] bytes) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public static final boolean c(g0 controller, hf0.m status) {
        return (controller != null ? controller.z() : null) == df0.c.CONNECTED && status != null && status.f72683p;
    }

    public static final boolean d(Context context, List<String> allVINs, String accountEmail, boolean isScanningForever) {
        if (accountEmail == null) {
            logger.j("email is null, shouldRunInForeground returning false");
            return false;
        }
        if (allVINs == null) {
            logger.j("vins null, shouldRunInForeground returning false");
            return false;
        }
        if (allVINs.isEmpty()) {
            logger.j("vins empty, shouldRunInForeground returning false");
            return false;
        }
        if (context == null) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("context null, shouldRunInForeground returning false");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
        if (isScanningForever) {
            return true;
        }
        he0.b bVarM = he0.b.m(context);
        for (String str : allVINs) {
            boolean zE = e(context, str, accountEmail);
            String strR = bVarM.r(str, accountEmail);
            boolean z11 = strR == null || p013kotlin.text.t.y0(strR);
            com.tesla.logging.g gVar2 = logger;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" supports phone key? ");
            sb2.append(zE);
            sb2.append(" and peripheral mapping exists? ");
            sb2.append(!z11);
            gVar2.j(sb2.toString());
            if (zE && !z11) {
                return true;
            }
        }
        logger.j("no vin supports phone key, shouldRunInForeground returning false");
        return false;
    }

    public static final boolean e(Context context, String vin, String accountEmail) {
        p013kotlin.jvm.internal.s.k(context, "context");
        if (accountEmail == null || accountEmail.length() == 0) {
            logger.j("vehicle doesn't support phone key: invalid email `" + accountEmail + "`");
            return false;
        }
        if (vin == null) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("VIN is null!");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
        if (p013kotlin.jvm.internal.s.f(f57036a.f(vin), Boolean.TRUE)) {
            return true;
        }
        com.tesla.logging.g gVar2 = logger;
        gVar2.j("looking up VehicleData by vin " + vin);
        u5 u5VarD = be0.e.INSTANCE.a().d(vin);
        Integer numO = u5VarD != null ? wb0.e.o(u5VarD) : null;
        if (numO != null && numO.intValue() > 0) {
            return true;
        }
        String strR = he0.b.m(context).r(vin, accountEmail);
        if (strR != null && strR.length() != 0) {
            return true;
        }
        gVar2.j("vehicle doesn't support phone key: no peripheral persisted for vin " + vin + "}");
        return false;
    }

    public final Boolean f(String vin) {
        if (vin == null) {
            return Boolean.FALSE;
        }
        if (vin.length() <= 4) {
            logger.j("vehicle doesn't support phone key: invalid VIN!");
            return Boolean.FALSE;
        }
        String strSubstring = vin.substring(3, 4);
        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
        int iCharAt = vin.charAt(9) + 1944;
        if (iCharAt <= 2020 && !p013kotlin.text.t.M(strSubstring, "3", true) && !p013kotlin.text.t.M(strSubstring, "Y", true)) {
            return null;
        }
        if (iCharAt != 2021 || (!p013kotlin.text.t.M(strSubstring, "s", true) && !p013kotlin.text.t.M(strSubstring, "x", true))) {
            return Boolean.TRUE;
        }
        String strSubstring2 = vin.substring(7, 8);
        p013kotlin.jvm.internal.s.j(strSubstring2, "substring(...)");
        return Boolean.valueOf(!p013kotlin.collections.d1.i("1", "2", "3", "4").contains(strSubstring2));
    }
}
