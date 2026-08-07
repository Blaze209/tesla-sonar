package atd.d;

import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import wo0.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"decodeToJsonObject", "Lkotlinx/serialization/json/JsonObject;", "", "toJSONObject", "Lorg/json/JSONObject;", "toJSONArray", "Lorg/json/JSONArray;", "Lkotlinx/serialization/json/JsonArray;", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char getSDKAppID;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKReferenceNumber = -4201337076207898698L;
        AuthenticationRequestParameters = -1885430439;
        getSDKAppID = (char) 12214;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r0 = r6 + 2
            int r7 = 122 - r7
            byte[] r1 = atd.d.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 1
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r5]
        L27:
            int r7 = r7 + r3
            int r5 = r5 + 1
            int r7 = r7 + 6
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.BuildConfig.a(short, byte, short, java.lang.Object[]):void");
    }

    private static void b(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        if (str3 != null) {
            $11 = ($10 + 7) % 128;
            charArray = str3.toCharArray();
            $10 = ($11 + 69) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = charArray2.length;
        char[] cArr3 = new char[length2];
        int i12 = 0;
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(charArray2, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c11);
        int i13 = 2;
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(num2);
                int i14 = i13;
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i12) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i12) == 0.0d ? 0 : -1)), 21 - KeyEvent.normalizeMetaState(i12));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    c(b11, b12, (byte) (b12 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) TextUtils.getCapsMode("", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i15 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i14] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[1] = Integer.valueOf(i15);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2446 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionGroup(0L) + 18);
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr6 = new Object[1];
                    c(b13, b14, (byte) (-b14), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i16 = cArr2[iIntValue2] * 32718;
                char c12 = cArr3[iIntValue];
                Object[] objArr7 = new Object[i14];
                objArr7[1] = Integer.valueOf(c12);
                objArr7[0] = Integer.valueOf(i16);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2969 - (ViewConfiguration.getTapTimeout() >> 16), (char) (View.resolveSize(0, 0) + 9913), 37 - View.MeasureSpec.getMode(0))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr2[iIntValue2] = c13;
                int i17 = challengeResultTimeout.getSDKTransactionID;
                cArr4[i17] = (char) (((((long) (c13 ^ cArr[i17])) ^ (getSDKReferenceNumber ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKAppID) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i17 + 1;
                i13 = i14;
                cArr = cArr;
                length3 = length3;
                cArr2 = cArr2;
                num = num;
                num2 = num2;
                i12 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 102
            byte[] r1 = atd.d.BuildConfig.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.BuildConfig.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0 A[SYNTHETIC] */
    public static final JSONObject getSDKAppID(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        Object value;
        JsonObject jsonObject2;
        JSONObject sDKAppID;
        int i11;
        Object value2;
        JsonArray jsonArray;
        int i12;
        int i13;
        int i14;
        s.k(jsonObject, "");
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value3 = entry.getValue();
            Object sDKTransactionID = null;
            if (value3 instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) value3;
                getDeviceData = (getSDKTransactionID + 115) % 128;
            } else {
                jsonPrimitive = null;
            }
            String str = (String) entry.getKey();
            if (jsonPrimitive != null) {
                getDeviceData = (getSDKTransactionID + 5) % 128;
                Boolean boolG = j.g(jsonPrimitive);
                if (boolG != null) {
                    sDKTransactionID = boolG;
                } else if (jsonPrimitive != null) {
                    i14 = getSDKTransactionID + 41;
                    getDeviceData = i14 % 128;
                    if (i14 % 2 != 0) {
                        sDKTransactionID = jsonPrimitive.getContent();
                        i13 = 1;
                        int i15 = i13 / 0;
                    } else {
                        sDKTransactionID = jsonPrimitive.getContent();
                    }
                } else {
                    value = entry.getValue();
                    if (value instanceof JsonObject) {
                        jsonObject2 = (JsonObject) value;
                    } else {
                        jsonObject2 = null;
                    }
                    if (jsonObject2 != null) {
                        sDKAppID = getSDKAppID(jsonObject2);
                    } else {
                        sDKAppID = null;
                    }
                    if (sDKAppID == null) {
                        i11 = getDeviceData + 123;
                        getSDKTransactionID = i11 % 128;
                        if (i11 % 2 != 0) {
                            entry.getValue();
                            throw null;
                        }
                        value2 = entry.getValue();
                        if (value2 instanceof JsonArray) {
                            jsonArray = (JsonArray) value2;
                            getSDKTransactionID = (getDeviceData + 93) % 128;
                        } else {
                            jsonArray = null;
                        }
                        if (jsonArray != null) {
                            i12 = getSDKTransactionID + 59;
                            getDeviceData = i12 % 128;
                            if (i12 % 2 != 0) {
                                sDKTransactionID = getSDKTransactionID(jsonArray);
                                i13 = 57;
                                int i16 = i13 / 0;
                            } else {
                                sDKTransactionID = getSDKTransactionID(jsonArray);
                            }
                        }
                    } else {
                        sDKTransactionID = sDKAppID;
                    }
                }
            } else if (jsonPrimitive != null) {
                i14 = getSDKTransactionID + 41;
                getDeviceData = i14 % 128;
                if (i14 % 2 != 0) {
                    sDKTransactionID = jsonPrimitive.getContent();
                    i13 = 1;
                    int i17 = i13 / 0;
                } else {
                    sDKTransactionID = jsonPrimitive.getContent();
                }
            } else {
                value = entry.getValue();
                if (value instanceof JsonObject) {
                    jsonObject2 = (JsonObject) value;
                } else {
                    jsonObject2 = null;
                }
                if (jsonObject2 != null) {
                    sDKAppID = getSDKAppID(jsonObject2);
                } else {
                    sDKAppID = null;
                }
                if (sDKAppID == null) {
                    i11 = getDeviceData + 123;
                    getSDKTransactionID = i11 % 128;
                    if (i11 % 2 != 0) {
                        entry.getValue();
                        throw null;
                    }
                    value2 = entry.getValue();
                    if (value2 instanceof JsonArray) {
                        jsonArray = (JsonArray) value2;
                        getSDKTransactionID = (getDeviceData + 93) % 128;
                    } else {
                        jsonArray = null;
                    }
                    if (jsonArray != null) {
                        i12 = getSDKTransactionID + 59;
                        getDeviceData = i12 % 128;
                        if (i12 % 2 != 0) {
                            sDKTransactionID = getSDKTransactionID(jsonArray);
                            i13 = 57;
                            int i18 = i13 / 0;
                        } else {
                            sDKTransactionID = getSDKTransactionID(jsonArray);
                        }
                    }
                } else {
                    sDKTransactionID = sDKAppID;
                }
            }
            linkedHashMap.put(key, jSONObject.put(str, sDKTransactionID));
        }
        return jSONObject;
    }

    public static final JsonObject getSDKReferenceNumber(String str) {
        int i11 = getSDKTransactionID + 13;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            s.k(str, "");
            wo0.b.Companion companion = wo0.b.INSTANCE;
            companion.getSerializersModule();
            return (JsonObject) companion.d(JsonObject.INSTANCE.serializer(), str);
        }
        s.k(str, "");
        wo0.b.Companion companion2 = wo0.b.INSTANCE;
        companion2.getSerializersModule();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[PHI: r4
      0x0040: PHI (r4v7 java.lang.Boolean) = (r4v6 java.lang.Boolean), (r4v8 java.lang.Boolean) binds: [B:17:0x0046, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0085 A[SYNTHETIC] */
    private static final JSONArray getSDKTransactionID(JsonArray jsonArray) {
        JsonObject jsonObject;
        JSONObject sDKAppID;
        int i11;
        int i12;
        JsonArray jsonArray2;
        Boolean boolG;
        JSONArray jSONArray = new JSONArray();
        for (JsonElement jsonElement : jsonArray) {
            getSDKTransactionID = (getDeviceData + 83) % 128;
            Object sDKTransactionID = null;
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive != null) {
                int i13 = getSDKTransactionID + 19;
                getDeviceData = i13 % 128;
                if (i13 % 2 != 0) {
                    boolG = j.g(jsonPrimitive);
                    int i14 = 51 / 0;
                    if (boolG != null) {
                        sDKTransactionID = boolG;
                    } else if (jsonPrimitive != null) {
                        sDKTransactionID = jsonPrimitive.getContent();
                    } else {
                        if (jsonElement instanceof JsonObject) {
                            jsonObject = (JsonObject) jsonElement;
                        } else {
                            jsonObject = null;
                        }
                        if (jsonObject != null) {
                            sDKAppID = getSDKAppID(jsonObject);
                        } else {
                            sDKAppID = null;
                        }
                        if (sDKAppID == null) {
                            i11 = getSDKTransactionID;
                            i12 = i11 + 51;
                            getDeviceData = i12 % 128;
                            if (i12 % 2 != 0) {
                                throw null;
                            }
                            if (jsonElement instanceof JsonArray) {
                                jsonArray2 = (JsonArray) jsonElement;
                            } else {
                                getDeviceData = (i11 + 113) % 128;
                                jsonArray2 = null;
                            }
                            if (jsonArray2 != null) {
                                sDKTransactionID = getSDKTransactionID(jsonArray2);
                            }
                        } else {
                            sDKTransactionID = sDKAppID;
                        }
                    }
                } else {
                    boolG = j.g(jsonPrimitive);
                    if (boolG != null) {
                        sDKTransactionID = boolG;
                    } else if (jsonPrimitive != null) {
                        sDKTransactionID = jsonPrimitive.getContent();
                    } else {
                        if (jsonElement instanceof JsonObject) {
                            jsonObject = (JsonObject) jsonElement;
                        } else {
                            jsonObject = null;
                        }
                        if (jsonObject != null) {
                            sDKAppID = getSDKAppID(jsonObject);
                        } else {
                            sDKAppID = null;
                        }
                        if (sDKAppID == null) {
                            i11 = getSDKTransactionID;
                            i12 = i11 + 51;
                            getDeviceData = i12 % 128;
                            if (i12 % 2 != 0) {
                                throw null;
                            }
                            if (jsonElement instanceof JsonArray) {
                                jsonArray2 = (JsonArray) jsonElement;
                            } else {
                                getDeviceData = (i11 + 113) % 128;
                                jsonArray2 = null;
                            }
                            if (jsonArray2 != null) {
                                sDKTransactionID = getSDKTransactionID(jsonArray2);
                            }
                        } else {
                            sDKTransactionID = sDKAppID;
                        }
                    }
                }
            } else if (jsonPrimitive != null) {
                sDKTransactionID = jsonPrimitive.getContent();
            } else {
                if (jsonElement instanceof JsonObject) {
                    jsonObject = (JsonObject) jsonElement;
                } else {
                    jsonObject = null;
                }
                if (jsonObject != null) {
                    sDKAppID = getSDKAppID(jsonObject);
                } else {
                    sDKAppID = null;
                }
                if (sDKAppID == null) {
                    i11 = getSDKTransactionID;
                    i12 = i11 + 51;
                    getDeviceData = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                    if (jsonElement instanceof JsonArray) {
                        jsonArray2 = (JsonArray) jsonElement;
                    } else {
                        getDeviceData = (i11 + 113) % 128;
                        jsonArray2 = null;
                    }
                    if (jsonArray2 != null) {
                        sDKTransactionID = getSDKTransactionID(jsonArray2);
                    }
                } else {
                    sDKTransactionID = sDKAppID;
                }
            }
            jSONArray = jSONArray.put(sDKTransactionID);
            s.j(jSONArray, "");
        }
        return jSONArray;
    }

    static void init$0() {
        $$a = new byte[]{75, 126, 55, 101, -8, 9, -39, -21, 1, 1, 13, -5, -7, 7, -19, 3, -17, -4, -29, 33, -14, -17, -3, 7, 46, -7, -18, -9, 3, 0, -17, -12, -8, 13, -17, 0, -7, -34, 13, 6, -2, -22, 8, -5, -42, 11, 11, -23, 6, -14, 9, -21, 7, -5, -8, 9, -39, -21, 1, -16, 41, -6, -45, -11, -1, -27, -39};
        $$b = 29;
    }

    static void init$1() {
        $$d = new byte[]{93, 60, 36, -28};
        $$e = 189;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:104:0x081d  */
    /* JADX WARN: Code duplicated, block: B:105:0x081e A[Catch: all -> 0x0878, TryCatch #4 {all -> 0x0878, blocks: (B:5:0x0061, B:9:0x00b4, B:8:0x007a, B:27:0x0295, B:31:0x02ef, B:37:0x0316, B:41:0x0370, B:94:0x073d, B:98:0x079e, B:97:0x0759, B:102:0x0802, B:106:0x0860, B:105:0x081e, B:54:0x048e, B:58:0x04df, B:57:0x04a6, B:40:0x032b, B:30:0x02ae, B:19:0x01dc, B:23:0x0238, B:22:0x01f9), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x030d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0316 A[Catch: all -> 0x0878, TRY_ENTER, TryCatch #4 {all -> 0x0878, blocks: (B:5:0x0061, B:9:0x00b4, B:8:0x007a, B:27:0x0295, B:31:0x02ef, B:37:0x0316, B:41:0x0370, B:94:0x073d, B:98:0x079e, B:97:0x0759, B:102:0x0802, B:106:0x0860, B:105:0x081e, B:54:0x048e, B:58:0x04df, B:57:0x04a6, B:40:0x032b, B:30:0x02ae, B:19:0x01dc, B:23:0x0238, B:22:0x01f9), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x032a  */
    /* JADX WARN: Code duplicated, block: B:40:0x032b A[Catch: all -> 0x0878, TryCatch #4 {all -> 0x0878, blocks: (B:5:0x0061, B:9:0x00b4, B:8:0x007a, B:27:0x0295, B:31:0x02ef, B:37:0x0316, B:41:0x0370, B:94:0x073d, B:98:0x079e, B:97:0x0759, B:102:0x0802, B:106:0x0860, B:105:0x081e, B:54:0x048e, B:58:0x04df, B:57:0x04a6, B:40:0x032b, B:30:0x02ae, B:19:0x01dc, B:23:0x0238, B:22:0x01f9), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x0410  */
    /* JADX WARN: Code duplicated, block: B:51:0x044d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0453  */
    /* JADX WARN: Code duplicated, block: B:56:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x04a6 A[Catch: all -> 0x0878, TryCatch #4 {all -> 0x0878, blocks: (B:5:0x0061, B:9:0x00b4, B:8:0x007a, B:27:0x0295, B:31:0x02ef, B:37:0x0316, B:41:0x0370, B:94:0x073d, B:98:0x079e, B:97:0x0759, B:102:0x0802, B:106:0x0860, B:105:0x081e, B:54:0x048e, B:58:0x04df, B:57:0x04a6, B:40:0x032b, B:30:0x02ae, B:19:0x01dc, B:23:0x0238, B:22:0x01f9), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x04fd A[Catch: Exception -> 0x0629, TRY_LEAVE, TryCatch #2 {Exception -> 0x0629, blocks: (B:61:0x04f7, B:63:0x04fd), top: B:123:0x04f7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0538  */
    /* JADX WARN: Code duplicated, block: B:67:0x0539 A[Catch: all -> 0x061d, TryCatch #5 {all -> 0x061d, blocks: (B:64:0x0527, B:68:0x057f, B:67:0x0539), top: B:128:0x0527, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0617  */
    /* JADX WARN: Code duplicated, block: B:72:0x061a A[PHI: r6 r27
      0x061a: PHI (r6v30 ??) = (r6v29 ??), (r6v45 ??), (r6v55 ??) binds: [B:79:0x0629, B:119:0x061a, B:70:0x0615] A[DONT_GENERATE, DONT_INLINE]
      0x061a: PHI (r27v2 ??) = (r27v1 ??), (r27v4 ??), (r27v7 ??) binds: [B:79:0x0629, B:119:0x061a, B:70:0x0615] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x062d A[Catch: Exception -> 0x061a, TRY_LEAVE, TryCatch #1 {Exception -> 0x061a, blocks: (B:75:0x0621, B:77:0x0627, B:78:0x0628, B:80:0x062d, B:86:0x06b8, B:88:0x06e9, B:90:0x06ef, B:91:0x06f0, B:81:0x0659, B:85:0x06b1, B:84:0x066b, B:64:0x0527, B:68:0x057f, B:67:0x0539), top: B:122:0x04fb, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x066a  */
    /* JADX WARN: Code duplicated, block: B:84:0x066b A[Catch: all -> 0x06e8, TryCatch #3 {all -> 0x06e8, blocks: (B:81:0x0659, B:85:0x06b1, B:84:0x066b), top: B:125:0x0659, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0758  */
    /* JADX WARN: Code duplicated, block: B:97:0x0759 A[Catch: all -> 0x0878, TryCatch #4 {all -> 0x0878, blocks: (B:5:0x0061, B:9:0x00b4, B:8:0x007a, B:27:0x0295, B:31:0x02ef, B:37:0x0316, B:41:0x0370, B:94:0x073d, B:98:0x079e, B:97:0x0759, B:102:0x0802, B:106:0x0860, B:105:0x081e, B:54:0x048e, B:58:0x04df, B:57:0x04a6, B:40:0x032b, B:30:0x02ae, B:19:0x01dc, B:23:0x0238, B:22:0x01f9), top: B:127:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v44, types: [int] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v83 */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r8v52, types: [java.lang.reflect.Method] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static java.lang.Object[] getSDKReferenceNumber(android.content.Context r35, int r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.BuildConfig.getSDKReferenceNumber(android.content.Context, int, int):java.lang.Object[]");
    }
}
