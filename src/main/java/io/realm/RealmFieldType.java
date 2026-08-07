package io.realm;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.plaid.internal.EnumC4419g;
import io.realm.internal.Keep;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    DECIMAL128(11),
    OBJECT_ID(15),
    UUID(17),
    MIXED(6),
    TYPED_LINK(16),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(128),
    BOOLEAN_LIST(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE),
    STRING_LIST(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE),
    BINARY_LIST(132),
    DATE_LIST(136),
    FLOAT_LIST(137),
    DOUBLE_LIST(138),
    DECIMAL128_LIST(139),
    OBJECT_ID_LIST(143),
    UUID_LIST(145),
    MIXED_LIST(134),
    STRING_TO_INTEGER_MAP(512),
    STRING_TO_BOOLEAN_MAP(513),
    STRING_TO_STRING_MAP(SyslogConstants.SYSLOG_PORT),
    STRING_TO_BINARY_MAP(516),
    STRING_TO_DATE_MAP(520),
    STRING_TO_FLOAT_MAP(521),
    STRING_TO_DOUBLE_MAP(522),
    STRING_TO_DECIMAL128_MAP(523),
    STRING_TO_OBJECT_ID_MAP(527),
    STRING_TO_UUID_MAP(529),
    STRING_TO_MIXED_MAP(518),
    STRING_TO_LINK_MAP(524),
    INTEGER_SET(256),
    BOOLEAN_SET(EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE),
    STRING_SET(EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE),
    BINARY_SET(EnumC4419g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE),
    DATE_SET(EnumC4419g.SDK_ASSET_ICON_PLAID_LOGO_VALUE),
    FLOAT_SET(EnumC4419g.SDK_ASSET_HEADER_SHIELD_VALUE),
    DOUBLE_SET(EnumC4419g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE),
    DECIMAL128_SET(EnumC4419g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE),
    OBJECT_ID_SET(EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE),
    UUID_SET(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE),
    LINK_SET(EnumC4419g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE),
    MIXED_SET(EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);

    private static final RealmFieldType[] basicTypes = new RealmFieldType[18];
    private static final RealmFieldType[] listTypes = new RealmFieldType[18];
    private static final RealmFieldType[] mapTypes = new RealmFieldType[18];
    private static final RealmFieldType[] setTypes = new RealmFieldType[18];
    private final int nativeValue;

    static {
        for (RealmFieldType realmFieldType : values()) {
            int i11 = realmFieldType.nativeValue;
            if (i11 < 128) {
                basicTypes[i11] = realmFieldType;
            } else {
                if (i11 < 256) {
                    listTypes[i11 + RangingPosition.RSSI_UNKNOWN] = realmFieldType;
                } else if (i11 < 512) {
                    setTypes[i11 - 256] = realmFieldType;
                } else {
                    mapTypes[i11 - 512] = realmFieldType;
                }
            }
        }
    }

    RealmFieldType(int i11) {
        this.nativeValue = i11;
    }

    public static RealmFieldType fromNativeValue(int i11) {
        RealmFieldType realmFieldType;
        RealmFieldType realmFieldType2;
        RealmFieldType realmFieldType3;
        RealmFieldType realmFieldType4;
        if (i11 >= 0) {
            RealmFieldType[] realmFieldTypeArr = basicTypes;
            if (i11 < realmFieldTypeArr.length && (realmFieldType4 = realmFieldTypeArr[i11]) != null) {
                return realmFieldType4;
            }
        }
        if (128 <= i11 && i11 < 256) {
            int i12 = i11 + RangingPosition.RSSI_UNKNOWN;
            RealmFieldType[] realmFieldTypeArr2 = listTypes;
            if (i12 < realmFieldTypeArr2.length && (realmFieldType3 = realmFieldTypeArr2[i12]) != null) {
                return realmFieldType3;
            }
        }
        if (256 <= i11 && i11 < 512) {
            int i13 = i11 - 256;
            RealmFieldType[] realmFieldTypeArr3 = setTypes;
            if (i13 < realmFieldTypeArr3.length && (realmFieldType2 = realmFieldTypeArr3[i13]) != null) {
                return realmFieldType2;
            }
        }
        if (512 <= i11) {
            int i14 = i11 - 512;
            RealmFieldType[] realmFieldTypeArr4 = mapTypes;
            if (i14 < realmFieldTypeArr4.length && (realmFieldType = realmFieldTypeArr4[i14]) != null) {
                return realmFieldType;
            }
        }
        throw new IllegalArgumentException("Invalid native Realm type: " + i11);
    }

    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x004f A[FALL_THROUGH, RETURN] */
    public boolean isValid(Object obj) {
        int i11 = this.nativeValue;
        if (i11 == 0) {
            return (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte);
        }
        if (i11 == 1) {
            return obj instanceof Boolean;
        }
        if (i11 == 2) {
            return obj instanceof String;
        }
        if (i11 == 4) {
            return (obj instanceof byte[]) || (obj instanceof ByteBuffer);
        }
        if (i11 != 6) {
            switch (i11) {
                case 6:
                    break;
                case 17:
                    return obj instanceof UUID;
                default:
                    switch (i11) {
                        case 8:
                            return obj instanceof Date;
                        case 9:
                            return obj instanceof Float;
                        case 10:
                            return obj instanceof Double;
                        case 11:
                            return obj instanceof Decimal128;
                        case 12:
                        case 13:
                        case 14:
                            break;
                        case 15:
                            return obj instanceof ObjectId;
                        default:
                            switch (i11) {
                                default:
                                    switch (i11) {
                                        default:
                                            switch (i11) {
                                                default:
                                                    switch (i11) {
                                                        default:
                                                            switch (i11) {
                                                                default:
                                                                    switch (i11) {
                                                                        case 520:
                                                                        case 521:
                                                                        case 522:
                                                                        case 523:
                                                                        case 524:
                                                                            break;
                                                                        default:
                                                                            throw new RuntimeException("Unsupported Realm type:  " + this);
                                                                    }
                                                                case 512:
                                                                case 513:
                                                                case SyslogConstants.SYSLOG_PORT /* 514 */:
                                                                    return false;
                                                            }
                                                        case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                                                        case SDK_ASSET_HEADER_SHIELD_VALUE:
                                                        case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                                                        case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                                                        case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                                                            return false;
                                                    }
                                                case 256:
                                                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                                                case SDK_ASSET_HEADER_BOLT_VALUE:
                                                    return false;
                                            }
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            return false;
                                    }
                                case 128:
                                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                    return false;
                            }
                            break;
                    }
                case 132:
                case 134:
                case 143:
                case 145:
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE:
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                case 516:
                case 518:
                case 527:
                case 529:
                    return false;
            }
        }
        return obj instanceof d0;
    }
}
