package atd.e;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getTransactionStatus extends ChallengeResultError {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    public static final Parcelable.Creator<getTransactionStatus> CREATOR;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private List<ChallengeResultCompleted> getDeviceData;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        completed();
        CREATOR = new Parcelable.Creator<getTransactionStatus>() { // from class: atd.e.getTransactionStatus.4
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKReferenceNumber;

            private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
                Parcel parcel = (Parcel) objArr[1];
                AuthenticationRequestParameters = (getSDKReferenceNumber + 53) % 128;
                getTransactionStatus gettransactionstatus = (getTransactionStatus) getSDKAppID(new Object[]{parcel}, -1721842786, 1721842788, (int) System.currentTimeMillis());
                int i11 = getSDKReferenceNumber + 109;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 != 0) {
                    return gettransactionstatus;
                }
                throw null;
            }

            public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
                int i14 = ~i11;
                int i15 = ~i12;
                int i16 = ~(i14 | i15);
                int i17 = (i11 * (-575)) + (i12 * (-575)) + (((~(i15 | i13)) | i16) * 576) + (((~(i11 | (~i13) | i15)) | (~(i12 | i14))) * 576) + (i16 * 576);
                if (i17 != 1) {
                    if (i17 != 2) {
                        return i17 != 3 ? getSDKAppID(objArr) : AuthenticationRequestParameters(objArr);
                    }
                    return getSDKTransactionID(objArr);
                }
                int iIntValue = ((Number) objArr[1]).intValue();
                int i18 = AuthenticationRequestParameters;
                getSDKReferenceNumber = (((i18 | 81) << 1) - (i18 ^ 81)) % 128;
                getTransactionStatus[] gettransactionstatusArr = (getTransactionStatus[]) getSDKAppID(new Object[]{Integer.valueOf(iIntValue)}, 864834142, -864834142, iIntValue);
                int i19 = AuthenticationRequestParameters;
                int i21 = i19 ^ 77;
                getSDKReferenceNumber = ((((i19 & 77) | i21) << 1) - i21) % 128;
                return gettransactionstatusArr;
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                getTransactionStatus gettransactionstatus = new getTransactionStatus((Parcel) objArr[0]);
                int i11 = getSDKReferenceNumber;
                int i12 = (i11 ^ 10) + ((i11 & 10) << 1);
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 16 / 0;
                }
                return gettransactionstatus;
            }

            private static getTransactionStatus p_(Parcel parcel) {
                return (getTransactionStatus) getSDKAppID(new Object[]{parcel}, -1721842786, 1721842788, (int) System.currentTimeMillis());
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.getTransactionStatus, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getTransactionStatus createFromParcel(Parcel parcel) {
                return getSDKAppID(new Object[]{this, parcel}, -643484034, 643484037, System.identityHashCode(this));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.getTransactionStatus[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getTransactionStatus[] newArray(int i11) {
                return (Object[]) getSDKAppID(new Object[]{this, Integer.valueOf(i11)}, -893962440, 893962441, i11);
            }

            private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i11 = getSDKReferenceNumber;
                int i12 = ((i11 | 119) << 1) - (((~i11) & 119) | (i11 & (-120)));
                AuthenticationRequestParameters = i12 % 128;
                getTransactionStatus[] gettransactionstatusArr = new getTransactionStatus[iIntValue];
                if (i12 % 2 == 0) {
                    int i13 = 63 / 0;
                }
                return gettransactionstatusArr;
            }

            private static getTransactionStatus[] getSDKAppID(int i11) {
                return (getTransactionStatus[]) getSDKAppID(new Object[]{Integer.valueOf(i11)}, 864834142, -864834142, i11);
            }
        };
        getSDKTransactionID = (getSDKReferenceNumber + 49) % 128;
    }

    getTransactionStatus(JsonObject jsonObject) throws Throwable {
        super(jsonObject);
        List<ChallengeResultCompleted> list = (List) ChallengeResultCompleted.AuthenticationRequestParameters(new Object[]{jsonObject}, -1020260015, 1020260015, (int) System.currentTimeMillis());
        this.getDeviceData = list;
        if (list.isEmpty()) {
            Object[] objArr = new Object[1];
            e("\udbac\ud7ac现\udbff埧⒞镲趇ᚓᝫ쟳\uf0e8䅲姌\uf2f6⌳돋賧㴗ᖓ\ueeac？濗墼", 1 - View.resolveSize(0, 0), objArr);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY, atd.am.getDeviceData.CHALLENGE_SELECT_INFO);
        }
    }

    static void completed() {
        getSDKAppID = -4999657544441388038L;
    }

    private static void e(String str, int i11, Object[] objArr) throws Throwable {
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
        char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getSDKAppID ^ 4326518537449951405L, (char[]) charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                String str2 = new String(deviceData, 4, deviceData.length - 4);
                $10 = ($11 + 45) % 128;
                objArr[0] = str2;
                return;
            }
            $10 = ($11 + 47) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (54837 - TextUtils.lastIndexOf("", '0', 0)), (Process.myTid() >> 22) + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1401, (char) (Color.alpha(0) + 16690), 21 - ImageFormat.getBitsPerPixel(0));
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr4 = new Object[1];
                    f(b11, b12, (byte) (b12 + 1), objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                $10 = ($11 + 53) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r5 = 101 - r5
            byte[] r0 = atd.e.getTransactionStatus.$$g
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
        L29:
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getTransactionStatus.f(short, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        getSDKTransactionID = (getSDKReferenceNumber + 119) % 128;
        super.getSDKTransactionID();
        List<ChallengeResultCompleted> list = gettransactionstatus.getDeviceData;
        if (list != null) {
            for (ChallengeResultCompleted challengeResultCompleted : list) {
                if (challengeResultCompleted != null) {
                    getSDKReferenceNumber = (getSDKTransactionID + 45) % 128;
                    ChallengeResultCompleted.AuthenticationRequestParameters(new Object[]{challengeResultCompleted}, -432059654, 432059659, System.identityHashCode(challengeResultCompleted));
                }
            }
            gettransactionstatus.getDeviceData.clear();
            gettransactionstatus.getDeviceData = null;
        }
        return null;
    }

    static void init$0() {
        $$g = new byte[]{20, -70, -28, 54};
        $$h = 10;
    }

    public final List<ChallengeResultCompleted> ChallengeResultKt() {
        int i11 = getSDKTransactionID + 13;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return this.getDeviceData;
        }
        throw null;
    }

    @Override // atd.e.ChallengeResultError, atd.e.getAdditionalDetails, atd.e.getSDKTransactionID, android.os.Parcelable
    public final int describeContents() {
        int i11 = getSDKReferenceNumber + 113;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // atd.e.ChallengeResultError, atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public final boolean equals(Object obj) {
        int i11 = getSDKTransactionID + 13;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getTransactionStatus.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        boolean zEquals = Objects.equals(this.getDeviceData, ((getTransactionStatus) obj).getDeviceData);
        int i12 = getSDKTransactionID + 85;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    @Override // atd.e.ChallengeResultError, atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public final void getSDKTransactionID() {
        getDeviceData(new Object[]{this}, 2122509732, -2122509732, System.identityHashCode(this));
    }

    @Override // atd.e.ChallengeResultError, atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public final int hashCode() {
        int iHashCode;
        getSDKTransactionID = (getSDKReferenceNumber + 11) % 128;
        int iHashCode2 = super.hashCode() * 31;
        List<ChallengeResultCompleted> list = this.getDeviceData;
        if (list != null) {
            iHashCode = list.hashCode();
        } else {
            getSDKReferenceNumber = (getSDKTransactionID + 59) % 128;
            iHashCode = 0;
        }
        return iHashCode2 + iHashCode;
    }

    @Override // atd.e.ChallengeResultError, atd.e.getAdditionalDetails, atd.e.getSDKTransactionID, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = getSDKTransactionID + 37;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            super.writeToParcel(parcel, i11);
            parcel.writeTypedList(this.getDeviceData);
            int i13 = 88 / 0;
        } else {
            super.writeToParcel(parcel, i11);
            parcel.writeTypedList(this.getDeviceData);
        }
        int i14 = getSDKReferenceNumber + 61;
        getSDKTransactionID = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    protected getTransactionStatus(Parcel parcel) {
        super(parcel);
        this.getDeviceData = parcel.createTypedArrayList(ChallengeResultCompleted.CREATOR);
    }
}
