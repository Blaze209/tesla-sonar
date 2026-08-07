package atd.w;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/MmsUaProfUrl;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransactionStatus extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/MmsUaProfUrl$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] getDeviceData;
        private static long getSDKReferenceNumber;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKReferenceNumber = -7091158159413978331L;
            getDeviceData = new char[]{30807, 30954, 30967, 30974, 30857, 30966, 30936, 30930, 30926, 30933, 30935, 30953, 30849, 30968, 30851, 30967, 30928, 30933, 30941, 30954, 30860, 30972, 30936, 30930, 30926, 30933, 30935, 30953, 30849, 30971, 30966, 30727, 30805, 30808, 30810, 30809, 30809, 30825, 30823, 30808, 30810, 30808, 30809, 30812, 30822, 30812, 30802, 30808, 30727, 30805, 30808, 30810, 30809, 30809, 30825, 30823, 30808, 30810, 30808, 30809, 30812, 30822, 30721, 30835, 30800, 30833, 30831, 30799, 30807, 30802, 30799, 30800, 30807, 30838, 30839, 30808, 30802, 30798, 30805, 30807, 30809, 30886, 30903, 30901, 30893, 30900, 30892, 30803, 30903, 30901, 30907, 30897, 30905, 30907, 30794, 30726, 30792, 30790, 30788, 30785, 30789, 30795, 30822, 30825, 30790, 30787, 30910, 30789, 30790, 30910, 30814, 30816, 30787, 30818, 30832, 30809, 30799, 30792, 30795, 30797, 30795, 30808, 30804, 30791, 30791, 30723, 30791, 30791, 30910, 30907, 30787, 30808, 30836, 30813, 30907, 30787, 30792, 30820, 30811, 30902, 30910, 30785, 30907, 30784, 30792, 30784, 30812, 30823, 30787, 30787, 30793, 30909, 30905, 30908, 30909, 30787, 30794, 30811, 30809, 30784, 30786, 30794, 30803, 30954, 30958, 30956, 30956, 30950, 30964, 30969, 30946, 30945, 30952, 30734, 30809, 30807, 30805, 30798, 30802, 30808, 30839, 30838, 30807, 30800, 30799, 30802, 30807, 30799, 30831, 30833, 30800, 30835, 30846, 30816, 30806, 30804, 30809, 30804, 30794, 30797, 30805, 30896, 31015, 31038, 31035, 31008, 31018, 30917, 31039, 31012, 31023, 31019, 30732, 30802, 30804, 30812, 30808, 30809, 30809, 30800, 30797, 30805, 30826, 30826, 30802, 30804, 30807, 30805, 30807, 30807, 30808, 30792, 30932, 30932, 30935, 30939, 30931, 30929, 30932, 30934, 30928, 30928, 30964, 30957, 30929, 30937, 30929, 30920, 30926, 30927, 30919, 30952, 30965, 30937, 30928, 30920, 30954, 30968, 30967, 30859, 30857, 30975, 30953, 30928, 30920, 30728, 30808, 30806, 30802, 30808, 30806, 30805, 30803, 30815, 30846, 30734, 30732, 30840, 30808, 30805, 30810, 30809, 30808, 30805, 30810, 30813, 30802, 30808};
        }

        private getDeviceData() {
        }

        public static Object[] AuthenticationRequestParameters(Context context, int i11, int i12) throws Throwable {
            Class<String> cls = String.class;
            Class cls2 = Integer.TYPE;
            int i13 = 1;
            try {
                if (context == null) {
                    Object[] objArr = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                    int i14 = ~i11;
                    Object[] objArr2 = {Integer.valueOf(i12), 0, Integer.valueOf(217950267 + ((i11 | 259599859) * 140) + ((537186304 | (~(259599859 | i14))) * (-280)) + (((~(i11 | (-537186305))) | (~(789368912 | i14)) | 7417251) * 140))};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(552468314);
                    if (method == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0') + 2245, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46664), 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b11 = $$a[22];
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        a(b11, b12, b12, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls2, cls2, cls2);
                        map.put(552468314, method);
                    }
                    ((int[]) objArr[3])[0] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    return objArr;
                }
                try {
                    Object[] objArr4 = new Object[1];
                    b("軱켝ണ䭏西윶ւ䎯臀\udff1ᷯ娟頻홙ᐗ剳邞\ueeb8ⳍ檐꣯\ue95d❱敪ꌝ\ue14c㿘緶믯易㟻琋눕\uf03f乜豾쪆\u0894", 16871 - View.getDefaultSize(0, 0), objArr4);
                    Object[] objArr5 = (Object[]) Array.newInstance(Class.forName(((String) objArr4[0]).intern()), 2);
                    Object[] objArr6 = new Object[1];
                    c(true, new int[]{0, 31, 128, 0}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", objArr6);
                    try {
                        Object[] objArr7 = {((String) objArr6[0]).intern()};
                        Object[] objArr8 = new Object[1];
                        b("軱켝ണ䭏西윶ւ䎯臀\udff1ᷯ娟頻홙ᐗ剳邞\ueeb8ⳍ檐꣯\ue95d❱敪ꌝ\ue14c㿘緶믯易㟻琋눕\uf03f乜豾쪆\u0894", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16871, objArr8);
                        objArr5[0] = Class.forName(((String) objArr8[0]).intern()).getDeclaredConstructor(cls).newInstance(objArr7);
                        Object[] objArr9 = new Object[1];
                        b("軘샩ቐ搥랋य़孼ꫳﲍ丸臿펑╆瓼웥\u1879樥붙པ䄨郓\ue292㐾蟫\ud997⬌站첫ṝ倝ꎾ", 20047 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
                        try {
                            Object[] objArr10 = {((String) objArr9[0]).intern()};
                            Object[] objArr11 = new Object[1];
                            b("軱켝ണ䭏西윶ւ䎯臀\udff1ᷯ娟頻홙ᐗ剳邞\ueeb8ⳍ檐꣯\ue95d❱敪ꌝ\ue14c㿘緶믯易㟻琋눕\uf03f乜豾쪆\u0894", 16871 - KeyEvent.keyCodeFromString(""), objArr11);
                            objArr5[1] = Class.forName(((String) objArr11[0]).intern()).getDeclaredConstructor(cls).newInstance(objArr10);
                            try {
                                Object[] objArr12 = new Object[1];
                                b("軺ꆚ퀡¤㍈揙鉥슼\uf580␓咣蜪럊\ue656\u16fd䤴砨ꢫ\udb3b\u0bd2㩒櫸鵥", 12143 - Color.red(0), objArr12);
                                Class<?> cls4 = Class.forName(((String) objArr12[0]).intern());
                                Object[] objArr13 = new Object[1];
                                c(true, new int[]{31, 17, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr13);
                                Object objInvoke = cls4.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null);
                                try {
                                    Object[] objArr14 = new Object[1];
                                    b("軺ꆚ퀡¤㍈揙鉥슼\uf580␓咣蜪럊\ue656\u16fd䤴砨ꢫ\udb3b\u0bd2㩒櫸鵥", 12142 - MotionEvent.axisFromString(""), objArr14);
                                    Class<?> cls5 = Class.forName(((String) objArr14[0]).intern());
                                    Object[] objArr15 = new Object[1];
                                    b("軼麯깍븸쾾\udf6d\uef16ﳍ\u0c74ᰧⷿ㶁䴺嫣", (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4177, objArr15);
                                    try {
                                        Object[] objArr16 = {cls5.getMethod(((String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                        Object[] objArr17 = new Object[1];
                                        c(true, new int[]{48, 33, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr17);
                                        Class<?> cls6 = Class.forName(((String) objArr17[0]).intern());
                                        Object[] objArr18 = new Object[1];
                                        c(true, new int[]{81, 14, 36, 3}, null, objArr18);
                                        Object objInvoke2 = cls6.getMethod(((String) objArr18[0]).intern(), cls, cls2).invoke(objInvoke, objArr16);
                                        Object[] objArr19 = new Object[1];
                                        c(false, new int[]{95, 30, 15, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr19);
                                        Class<?> cls7 = Class.forName(((String) objArr19[0]).intern());
                                        Object[] objArr20 = new Object[1];
                                        b("軨᱿ꯦ㥒쓎刮\ue1a0輲᪖ꠝ", 37517 - Color.green(0), objArr20);
                                        Object[] objArr21 = (Object[]) cls7.getField(((String) objArr20[0]).intern()).get(objInvoke2);
                                        int length = objArr21.length;
                                        int i15 = 0;
                                        while (i15 < length) {
                                            Object obj = objArr21[i15];
                                            Object[] objArr22 = new Object[i13];
                                            b("軃颲ꊠ첾횾", TextUtils.getCapsMode("", 0, 0) + 5639, objArr22);
                                            try {
                                                Object[] objArr23 = {((String) objArr22[0]).intern()};
                                                Object[] objArr24 = new Object[1];
                                                c(true, new int[]{125, 37, 18, 26}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr24);
                                                Class<?> cls8 = Class.forName(((String) objArr24[0]).intern());
                                                int i16 = length;
                                                Object[] objArr25 = new Object[1];
                                                c(false, new int[]{162, 11, 108, 3}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr25);
                                                Object objInvoke3 = cls8.getMethod(((String) objArr25[0]).intern(), cls).invoke(null, objArr23);
                                                try {
                                                    Object[] objArr26 = objArr21;
                                                    Object[] objArr27 = new Object[1];
                                                    c(false, new int[]{173, 28, 0, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr27);
                                                    Class<?> cls9 = Class.forName(((String) objArr27[0]).intern());
                                                    Class<String> cls10 = cls;
                                                    Object[] objArr28 = new Object[1];
                                                    c(false, new int[]{EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 11, 168, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", objArr28);
                                                    try {
                                                        Object[] objArr29 = {new ByteArrayInputStream((byte[]) cls9.getMethod(((String) objArr28[0]).intern(), null).invoke(obj, null))};
                                                        Object[] objArr30 = new Object[1];
                                                        c(true, new int[]{125, 37, 18, 26}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr30);
                                                        Class<?> cls11 = Class.forName(((String) objArr30[0]).intern());
                                                        Object[] objArr31 = new Object[1];
                                                        c(true, new int[]{EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, 19, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", objArr31);
                                                        Object objInvoke4 = cls11.getMethod(((String) objArr31[0]).intern(), InputStream.class).invoke(objInvoke3, objArr29);
                                                        for (int i17 = 0; i17 < 2; i17++) {
                                                            Object obj2 = objArr5[i17];
                                                            try {
                                                                Object[] objArr32 = new Object[1];
                                                                c(false, new int[]{EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 34, 131, 7}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", objArr32);
                                                                Class<?> cls12 = Class.forName(((String) objArr32[0]).intern());
                                                                Object[] objArr33 = new Object[1];
                                                                c(true, new int[]{EnumC4419g.SDK_ASSET_HEADER_SHIELD_VALUE, 23, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", objArr33);
                                                                if (obj2.equals(cls12.getMethod(((String) objArr33[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                    Object[] objArr34 = {new int[]{i11}, new int[]{i11 ^ 1}, null, new int[1]};
                                                                    int i18 = 1565494539 + ((~(i11 | 525680047)) * EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                                                    int i19 = ~i11;
                                                                    try {
                                                                        Object[] objArr35 = {Integer.valueOf(i12), 16, Integer.valueOf(i18 + (((-2146321) | i19) * (-216)) + (((~(525680047 | i19)) | 523288724) * EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                                                                        Map map2 = atd.a.getMessageVersion.timedout;
                                                                        Object method2 = map2.get(552468314);
                                                                        if (method2 == null) {
                                                                            Class cls13 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2244 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46664), (Process.myTid() >> 22) + 26);
                                                                            byte b13 = $$a[22];
                                                                            byte b14 = b13;
                                                                            Object[] objArr36 = new Object[1];
                                                                            a(b13, b14, b14, objArr36);
                                                                            method2 = cls13.getMethod((String) objArr36[0], cls2, cls2, cls2);
                                                                            map2.put(552468314, method2);
                                                                        }
                                                                        ((int[]) objArr34[3])[0] = ((Integer) ((Method) method2).invoke(null, objArr35)).intValue();
                                                                        return objArr34;
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause = th2.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause2 = th3.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th3;
                                                            }
                                                        }
                                                        i15++;
                                                        length = i16;
                                                        objArr21 = objArr26;
                                                        cls = cls10;
                                                        i13 = 1;
                                                    } catch (Throwable th4) {
                                                        Throwable cause3 = th4.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th4;
                                                    }
                                                } catch (Throwable th5) {
                                                    Throwable cause4 = th5.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th5;
                                                }
                                            } catch (Throwable th6) {
                                                Throwable cause5 = th6.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th6;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause6 = th7.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause7 = th8.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause8 = th9.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause9 = th10.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th10;
                        }
                    } catch (Throwable th11) {
                        Throwable cause10 = th11.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th11;
                    }
                } catch (Throwable unused) {
                }
                Object[] objArr37 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                int i21 = ~((-119169856) | i11);
                int i22 = (-769950073) + ((1073211 | i21) * (-280)) + ((i21 | (~((-929798917) | i11))) * 140);
                int i23 = ~((-118096645) | i11);
                int i24 = ~i11;
                Object[] objArr38 = {Integer.valueOf(i12), 0, Integer.valueOf(i22 + (((~(i24 | (-811702273))) | i23 | (~((-1073212) | i24))) * 140))};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(552468314);
                if (method3 == null) {
                    Class cls14 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 2245, (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 46664), 25 - TextUtils.indexOf((CharSequence) "", '0'));
                    byte b15 = $$a[22];
                    byte b16 = b15;
                    Object[] objArr39 = new Object[1];
                    a(b15, b16, b16, objArr39);
                    method3 = cls14.getMethod((String) objArr39[0], cls2, cls2, cls2);
                    map3.put(552468314, method3);
                }
                ((int[]) objArr37[3])[0] = ((Integer) ((Method) method3).invoke(null, objArr38)).intValue();
                return objArr37;
            } catch (Throwable th12) {
                Throwable cause11 = th12.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th12;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 2
                int r0 = 21 - r7
                int r8 = r8 * 4
                int r8 = r8 + 103
                byte[] r1 = atd.w.getTransactionStatus.getDeviceData.$$a
                int r6 = r6 * 2
                int r6 = 3 - r6
                byte[] r0 = new byte[r0]
                int r7 = 20 - r7
                r2 = 0
                if (r1 != 0) goto L1a
                r3 = r1
                r4 = r2
                r1 = r8
                r8 = r6
                goto L34
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2a:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L34:
                int r6 = -r6
                int r1 = r1 + r6
                int r6 = r1 + 3
                r1 = r8
                r8 = r6
                r6 = r1
                r1 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getTransactionStatus.getDeviceData.a(short, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0160  */
        /* JADX WARN: Code duplicated, block: B:37:0x0161  */
        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            Throwable cause;
            int i12;
            int i13 = $10;
            int i14 = i13 + 61;
            $11 = i14 % 128;
            char c11 = 2;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                $11 = (i13 + 51) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
            gettransactionstatus.getSDKAppID = i11;
            int length = cArr.length;
            long[] jArr = new long[length];
            int i15 = 0;
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i16 = gettransactionstatus.getSDKTransactionID;
                if (i16 >= cArr.length) {
                    break;
                }
                $11 = ($10 + 107) % 128;
                char c12 = cArr[i16];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[c11] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i15] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(962978490);
                    if (method != null) {
                        i12 = i15;
                    } else {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(689 - View.combineMeasuredStates(i15, i15), (char) (16022 - KeyEvent.normalizeMetaState(i15)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32);
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        i12 = i15;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, (byte) (b12 | 10), objArr3);
                        method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKReferenceNumber ^ (-2227742522694838850L));
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        int i17 = i12;
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(i17, i17) + 417, (char) (Color.argb(i17, i17, i17, i17) + 29017), 23 - TextUtils.lastIndexOf("", '0', i17, i17))).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    jArr = jArr;
                    c11 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            long[] jArr2 = jArr;
            char[] cArr2 = new char[length];
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i18 = gettransactionstatus.getSDKTransactionID;
                if (i18 >= cArr.length) {
                    break;
                }
                $11 = ($10 + 21) % 128;
                cArr2[i18] = (char) jArr2[i18];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29017), 24 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            }
            String str2 = new String(cArr2);
            int i19 = $11 + 93;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        private static void c(boolean z11, int[] iArr, String str, Object[] objArr) throws Throwable {
            int i11;
            String str2;
            Class<Object> cls;
            int length;
            char[] cArr;
            int i12;
            Object method;
            String str3 = str;
            Class<Object> cls2 = Object.class;
            $11 = ($10 + 7) % 128;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            int i16 = iArr[3];
            char[] cArr2 = getDeviceData;
            Class cls3 = Integer.TYPE;
            int i17 = 2;
            String str4 = "";
            if (cArr2 != null) {
                int i18 = $10 + 27;
                float f11 = BitmapDescriptorFactory.HUE_RED;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i12 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i12 = 0;
                }
                while (i12 < length) {
                    int i19 = i12;
                    $11 = ($10 + 95) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i19])};
                        int i21 = length;
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1708792688);
                        if (obj != null) {
                            method = obj;
                        } else {
                            float f12 = f11;
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2314 - (ViewConfiguration.getScrollFriction() > f11 ? 1 : (ViewConfiguration.getScrollFriction() == f11 ? 0 : -1)), (char) (PointF.length(f12, f12) > f12 ? 1 : (PointF.length(f12, f12) == f12 ? 0 : -1)), TextUtils.indexOf((CharSequence) str4, '0', 0, 0) + 25);
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            d(b11, b12, (byte) (b12 + 1), objArr3);
                            method = cls4.getMethod((String) objArr3[0], cls3);
                            map.put(-1708792688, method);
                        }
                        cArr[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i12 = i19 + 1;
                        $11 = ($10 + 55) % 128;
                        length = i21;
                        i15 = i15;
                        cArr = cArr;
                        cArr2 = cArr2;
                        i16 = i16;
                        cls2 = cls2;
                        str4 = str4;
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            } else {
                bArr = bArr;
            }
            Class<Object> cls5 = cls2;
            String str5 = str4;
            int i22 = i15;
            int i23 = i16;
            char[] cArr3 = new char[i14];
            System.arraycopy(cArr2, i13, cArr3, 0, i14);
            if (bArr != null) {
                char[] cArr4 = new char[i14];
                challengeResultError.getSDKAppID = 0;
                $10 = ($11 + 49) % 128;
                char c11 = 0;
                while (true) {
                    int i24 = challengeResultError.getSDKAppID;
                    if (i24 >= i14) {
                        break;
                    }
                    long j11 = 0;
                    if (bArr[i24] == 1) {
                        char c12 = cArr3[i24];
                        Object[] objArr4 = new Object[i17];
                        objArr4[1] = Integer.valueOf(c11);
                        objArr4[0] = Integer.valueOf(c12);
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method2 = map2.get(10570995);
                        if (method2 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 558, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5486), 23 - (ViewConfiguration.getEdgeSlop() >> 16));
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            d(b13, b14, b14, objArr5);
                            method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                            map2.put(10570995, method2);
                        }
                        cArr4[i24] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        cArr3 = cArr3;
                        j11 = 0;
                        Object[] objArr6 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c11)};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(-502074319);
                        if (method3 == null) {
                            method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.resolveSize(0, 0), 23 - ImageFormat.getBitsPerPixel(0))).getMethod("a", cls3, cls3);
                            map3.put(-502074319, method3);
                        }
                        cArr4[i24] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    }
                    c11 = cArr4[challengeResultError.getSDKAppID];
                    Object[] objArr7 = {challengeResultError, challengeResultError};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-399400818);
                    if (method4 != null) {
                        cls = cls5;
                        str2 = str5;
                    } else {
                        str2 = str5;
                        Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(853 - (ExpandableListView.getPackedPositionForChild(0, 0) > j11 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j11 ? 0 : -1)), (char) TextUtils.indexOf(str2, str2, 0, 0), ExpandableListView.getPackedPositionGroup(j11) + 24);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        d(b15, b16, (byte) (b16 + 3), objArr8);
                        cls = cls5;
                        method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                        map4.put(-399400818, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                    str5 = str2;
                    cls5 = cls;
                    cArr3 = cArr3;
                    cArr4 = cArr4;
                    i17 = 2;
                }
                cArr3 = cArr4;
            }
            if (i23 > 0) {
                $11 = ($10 + 19) % 128;
                char[] cArr5 = new char[i14];
                i11 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i14);
                int i25 = i14 - i23;
                System.arraycopy(cArr5, 0, cArr3, i25, i23);
                System.arraycopy(cArr5, i23, cArr3, 0, i25);
            } else {
                i11 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i14];
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i26 = challengeResultError.getSDKAppID;
                    if (i26 >= i14) {
                        break;
                    }
                    int i27 = $10 + 57;
                    $11 = i27 % 128;
                    if (i27 % 2 == 0) {
                        cArr6[i26] = cArr3[(i14 + i26) >> 1];
                    } else {
                        cArr6[i26] = cArr3[(i14 - i26) - 1];
                        i26++;
                    }
                    challengeResultError.getSDKAppID = i26;
                }
                cArr3 = cArr6;
            }
            if (i22 > 0) {
                int i28 = $10 + 99;
                $11 = i28 % 128;
                int i29 = i28 % 2;
                int i31 = 0;
                while (true) {
                    challengeResultError.getSDKAppID = i31;
                    int i32 = challengeResultError.getSDKAppID;
                    if (i32 >= i14) {
                        break;
                    }
                    cArr3[i32] = (char) (cArr3[i32] - iArr[2]);
                    i31 = i32 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = atd.w.getTransactionStatus.getDeviceData.$$d
                int r8 = r8 * 3
                int r8 = 1 - r8
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r9 = r9 * 2
                int r9 = r9 + 98
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r5 = r2
                r0 = r7
                goto L32
            L17:
                r3 = r9
                r9 = r7
                r7 = r3
                r3 = r2
            L1b:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                int r9 = r9 + 1
                if (r5 != r8) goto L2c
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2c:
                r3 = r0[r9]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L32:
                int r7 = r7 + r9
                r9 = r0
                r0 = r3
                r3 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getTransactionStatus.getDeviceData.d(short, int, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{93, -72, -53, -77, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10};
            $$b = 24;
        }

        static void init$1() {
            $$d = new byte[]{87, -43, 119, -41};
            $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        ViewConfiguration.getMaximumDrawingCacheSize();
        TypedValue.complexToFloat(0);
        TypedValue.complexToFloat(0);
        Color.green(0);
        ViewConfiguration.getPressedStateDuration();
        new getDeviceData((byte) 0);
        int i11 = ChallengeResultCancelled + 69;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTransactionStatus(Application application) {
        super(application);
        s.k(application, "");
    }

    static void getSDKTransactionID() {
        getSDKAppID = 1793680534;
        getSDKReferenceNumber = -1568970084;
        AuthenticationRequestParameters = -1193846723;
        getSDKTransactionID = new byte[]{92, -8, -2, 17};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        String mmsUAProfUrl;
        getDeviceData = (ChallengeResultCancelled + 3) % 128;
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null || (mmsUAProfUrl = telephonyManagerCF_.getMmsUAProfUrl()) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = ChallengeResultCancelled + 37;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(mmsUAProfUrl);
        if (i12 == 0) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
        }
        DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
        throw null;
    }
}
