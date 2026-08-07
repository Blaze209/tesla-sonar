package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\bF\u0018\u0000 \u0088\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004NLPRB\u009d\u0004\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0002H\u0017¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010@H\u0096\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000eH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ£\u0004\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\bI\u0010JR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010MR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bS\u0010MR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010K\u001a\u0004\bT\u0010MR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bW\u0010MR\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bY\u0010MR\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bZ\u0010MR\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010MR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010]\u001a\u0004\b^\u0010ER\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010K\u001a\u0004\b`\u0010MR\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010K\u001a\u0004\bb\u0010MR\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010K\u001a\u0004\bd\u0010MR\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\be\u0010MR\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010K\u001a\u0004\bg\u0010MR\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010K\u001a\u0004\bh\u0010MR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bP\u0010oR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010t\u001a\u0004\bu\u0010vR\"\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001c\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010{\u001a\u0004\bR\u0010|R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010{\u001a\u0004\bU\u0010|R\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010{\u001a\u0004\bX\u0010|R\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010{\u001a\u0004\b[\u0010|R\u001c\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010{\u001a\u0004\bc\u0010|R\u001c\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010{\u001a\u0004\bf\u0010|R\u001c\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010{\u001a\u0004\b\u007f\u0010|R\u001d\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\bk\u0010{\u001a\u0005\b\u0080\u0001\u0010|R\u001d\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\by\u0010{\u001a\u0005\b\u0081\u0001\u0010|R\u001e\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010{\u001a\u0005\b\u0083\u0001\u0010|R\u001f\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b~\u0010\u0086\u0001R\u001d\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0087\u0001\u0010{\u001a\u0004\bp\u0010|R\u001d\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b]\u0010{\u001a\u0005\b\u0088\u0001\u0010|R\u001c\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010{\u001a\u0004\bw\u0010|R\u001d\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0089\u0001\u0010{\u001a\u0004\b]\u0010|R\u001d\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\bg\u0010{\u001a\u0005\b\u0089\u0001\u0010|R\u001c\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u007f\u0010{\u001a\u0004\b}\u0010|R\u001f\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bW\u0010\u008a\u0001\u001a\u0006\b\u0087\u0001\u0010\u008b\u0001R \u00104\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0085\u0001\u001a\u0006\b\u0084\u0001\u0010\u0086\u0001R\u001d\u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\bZ\u0010{\u001a\u0005\b\u0082\u0001\u0010|R\u001d\u00106\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0080\u0001\u0010{\u001a\u0004\bi\u0010|R\u001c\u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010{\u001a\u0004\bm\u0010|R\u001d\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0083\u0001\u0010{\u001a\u0004\b_\u0010|R\u001c\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010{\u001a\u0004\ba\u0010|¨\u0006\u008c\u0001"}, d2 = {"Lgc0/r;", "Lcom/squareup/wire/f;", "", "", "door_open_driver_front_OBSOLETE", "door_open_driver_rear_OBSOLETE", "door_open_passenger_front_OBSOLETE", "door_open_passenger_rear_OBSOLETE", "door_open_trunk_front_OBSOLETE", "door_open_trunk_rear_OBSOLETE", "window_open_driver_front_OBSOLETE", "window_open_passenger_front_OBSOLETE", "window_open_driver_rear_OBSOLETE", "window_open_passenger_rear_OBSOLETE", "", "sun_roof_percent_open_OBSOLETE", "locked_OBSOLETE", "is_user_present_OBSOLETE", "remote_start_OBSOLETE", "valet_mode_OBSOLETE", "valet_pin_needed_OBSOLETE", "sentry_mode_available_OBSOLETE", "Lgc0/r$e;", "sun_roof_state", "Lgc0/r$c;", "center_display_state", "Lgc0/r$d;", "sentry_mode_state", "Lgc0/p0;", "speed_limit_mode", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "door_open_driver_front", "door_open_driver_rear", "door_open_passenger_front", "door_open_passenger_rear", "door_open_trunk_front", "door_open_trunk_rear", "window_open_driver_front", "window_open_passenger_front", "window_open_driver_rear", "window_open_passenger_rear", "sun_roof_percent_open", "locked", "is_user_present", "remote_start", "valet_mode", "valet_pin_needed", "sentry_mode_available", "Lvc0/g0;", "tonneau_state", "tonneau_percent_open", "tonneau_in_motion", "has_automatic_tonneau", "has_side_storage_doors", "door_open_side_storage_left", "door_open_side_storage_right", "Lokio/k;", "unknownFields", "<init>", "(ZZZZZZZZZZIZZZZZZLgc0/r$e;Lgc0/r$c;Lgc0/r$d;Lgc0/p0;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvc0/g0;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZZZZZZZZZZIZZZZZZLgc0/r$e;Lgc0/r$c;Lgc0/r$d;Lgc0/p0;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvc0/g0;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/r;", "Z", "e", "()Z", "b", "g", "c", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "k", "o", "f", "q", Gender.NONE, "h", "R", "P", "j", "T", "I", "C", "l", "u", "m", "V", "n", "w", "J", "p", "L", "y", "r", "Lgc0/r$e;", "D", "()Lgc0/r$e;", "s", "Lgc0/r$c;", "()Lgc0/r$c;", "t", "Lgc0/r$d;", "z", "()Lgc0/r$d;", "Lgc0/p0;", "A", "()Lgc0/p0;", "v", "Lj$/time/Instant;", "E", "()Lj$/time/Instant;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "x", "B", Gender.MALE, "Q", Gender.OTHER, Gender.FEMALE, "S", "G", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "H", Gender.UNKNOWN, "K", "Lvc0/g0;", "()Lvc0/g0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends com.squareup.wire.f {
    public static final ProtoAdapter<r> V = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkFront", tag = 105)
    private final Boolean door_open_trunk_front;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkRear", tag = 106)
    private final Boolean door_open_trunk_rear;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverFront", tag = 107)
    private final Boolean window_open_driver_front;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerFront", tag = 108)
    private final Boolean window_open_passenger_front;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverRear", tag = 109)
    private final Boolean window_open_driver_rear;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerRear", tag = 110)
    private final Boolean window_open_passenger_rear;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "sunRoofPercentOpen", tag = 112)
    private final Integer sun_roof_percent_open;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 113)
    private final Boolean locked;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUserPresent", tag = 114)
    private final Boolean is_user_present;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStart", tag = 116)
    private final Boolean remote_start;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetMode", tag = 117)
    private final Boolean valet_mode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetPinNeeded", tag = 118)
    private final Boolean valet_pin_needed;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sentryModeAvailable", tag = 120)
    private final Boolean sentry_mode_available;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", jsonName = "tonneauState", tag = 23)
    private final vc0.g0 tonneau_state;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "tonneauPercentOpen", tag = 24)
    private final Integer tonneau_percent_open;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tonneauInMotion", tag = 25)
    private final Boolean tonneau_in_motion;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasAutomaticTonneau", tag = 26)
    private final Boolean has_automatic_tonneau;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSideStorageDoors", tag = 27)
    private final Boolean has_side_storage_doors;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenSideStorageLeft", tag = 28)
    private final Boolean door_open_side_storage_left;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenSideStorageRight", tag = 29)
    private final Boolean door_open_side_storage_right;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverFrontOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean door_open_driver_front_OBSOLETE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverRearOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final boolean door_open_driver_rear_OBSOLETE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerFrontOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final boolean door_open_passenger_front_OBSOLETE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerRearOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final boolean door_open_passenger_rear_OBSOLETE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkFrontOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final boolean door_open_trunk_front_OBSOLETE;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkRearOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final boolean door_open_trunk_rear_OBSOLETE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverFrontOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final boolean window_open_driver_front_OBSOLETE;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerFrontOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final boolean window_open_passenger_front_OBSOLETE;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverRearOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final boolean window_open_driver_rear_OBSOLETE;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerRearOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final boolean window_open_passenger_rear_OBSOLETE;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "sunRoofPercentOpenOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final int sun_roof_percent_open_OBSOLETE;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "lockedOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final boolean locked_OBSOLETE;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUserPresentOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final boolean is_user_present_OBSOLETE;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final boolean remote_start_OBSOLETE;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetModeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final boolean valet_mode_OBSOLETE;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetPinNeededOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final boolean valet_pin_needed_OBSOLETE;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sentryModeAvailableOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final boolean sentry_mode_available_OBSOLETE;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState$SunRoofState#ADAPTER", jsonName = "sunRoofState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final e sun_roof_state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState$DisplayState#ADAPTER", jsonName = "centerDisplayState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final c center_display_state;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState$SentryModeState#ADAPTER", jsonName = "sentryModeState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final d sentry_mode_state;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SpeedLimitMode#ADAPTER", jsonName = "speedLimitMode", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final p0 speed_limit_mode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2000)
    private final Instant timestamp;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverFront", tag = 101)
    private final Boolean door_open_driver_front;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverRear", tag = 102)
    private final Boolean door_open_driver_rear;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerFront", tag = 103)
    private final Boolean door_open_passenger_front;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerRear", tag = 104)
    private final Boolean door_open_passenger_rear;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/r$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/r;", "value", "", "c", "(Lgc0/r;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/r;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/r;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/r;)Lgc0/r;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r> {
        a(com.squareup.wire.b bVar, co0.d<r> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            boolean zBooleanValue3 = false;
            boolean zBooleanValue4 = false;
            boolean zBooleanValue5 = false;
            boolean zBooleanValue6 = false;
            boolean zBooleanValue7 = false;
            boolean zBooleanValue8 = false;
            boolean zBooleanValue9 = false;
            boolean zBooleanValue10 = false;
            int iIntValue = 0;
            boolean zBooleanValue11 = false;
            boolean zBooleanValue12 = false;
            boolean zBooleanValue13 = false;
            boolean zBooleanValue14 = false;
            boolean zBooleanValue15 = false;
            boolean zBooleanValue16 = false;
            c cVarDecode = null;
            d dVarDecode = null;
            p0 p0VarDecode = null;
            Instant instantDecode = null;
            Boolean boolDecode = null;
            Boolean boolDecode2 = null;
            Boolean boolDecode3 = null;
            Boolean boolDecode4 = null;
            Boolean boolDecode5 = null;
            Boolean boolDecode6 = null;
            Boolean boolDecode7 = null;
            Boolean boolDecode8 = null;
            Boolean boolDecode9 = null;
            Boolean boolDecode10 = null;
            Integer numDecode = null;
            Boolean boolDecode11 = null;
            Boolean boolDecode12 = null;
            Boolean boolDecode13 = null;
            Boolean boolDecode14 = null;
            Boolean boolDecode15 = null;
            Boolean boolDecode16 = null;
            vc0.g0 g0VarDecode = null;
            Integer numDecode2 = null;
            Boolean boolDecode17 = null;
            Boolean boolDecode18 = null;
            Boolean boolDecode19 = null;
            Boolean boolDecode20 = null;
            Boolean boolDecode21 = null;
            e eVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, iIntValue, zBooleanValue11, zBooleanValue12, zBooleanValue13, zBooleanValue14, zBooleanValue15, zBooleanValue16, eVarDecode, cVarDecode, dVarDecode, p0VarDecode, instantDecode, boolDecode, boolDecode2, boolDecode3, boolDecode4, boolDecode5, boolDecode6, boolDecode7, boolDecode8, boolDecode9, boolDecode10, numDecode, boolDecode11, boolDecode12, boolDecode13, boolDecode14, boolDecode15, boolDecode16, g0VarDecode, numDecode2, boolDecode17, boolDecode18, boolDecode19, boolDecode20, boolDecode21, reader.e(jD));
                }
                if (iG == 120) {
                    boolDecode16 = ProtoAdapter.BOOL.decode(reader);
                } else if (iG != 2000) {
                    switch (iG) {
                        case 1:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 2:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 3:
                            zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 4:
                            zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 5:
                            zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            zBooleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 7:
                            zBooleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 8:
                            zBooleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 9:
                            zBooleanValue9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 10:
                            zBooleanValue10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 11:
                            eVarDecode = e.f68431h.decode(reader);
                            break;
                        case 12:
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 13:
                            zBooleanValue11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 14:
                            zBooleanValue12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 15:
                            cVarDecode = c.f68411l.decode(reader);
                            break;
                        case 16:
                            zBooleanValue13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 17:
                            zBooleanValue14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 18:
                            zBooleanValue15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 19:
                            dVarDecode = d.f68423h.decode(reader);
                            break;
                        case 20:
                            zBooleanValue16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        default:
                            switch (iG) {
                                case 22:
                                    p0VarDecode = p0.f68303l.decode(reader);
                                    continue;
                                case 23:
                                    try {
                                        g0VarDecode = vc0.g0.ADAPTER.decode(reader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                                        cVarDecode = cVarDecode;
                                        zBooleanValue = zBooleanValue;
                                        zBooleanValue2 = zBooleanValue2;
                                    }
                                    break;
                                case 24:
                                    numDecode2 = ProtoAdapter.UINT32.decode(reader);
                                    continue;
                                case 25:
                                    boolDecode17 = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                case 26:
                                    boolDecode18 = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                case 27:
                                    boolDecode19 = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                case 28:
                                    boolDecode20 = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                case 29:
                                    boolDecode21 = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                default:
                                    switch (iG) {
                                        case 101:
                                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 102:
                                            boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 103:
                                            boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 104:
                                            boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 105:
                                            boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 106:
                                            boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 107:
                                            boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 108:
                                            boolDecode8 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 109:
                                            boolDecode9 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        case 110:
                                            boolDecode10 = ProtoAdapter.BOOL.decode(reader);
                                            continue;
                                        default:
                                            switch (iG) {
                                                case 112:
                                                    numDecode = ProtoAdapter.INT32.decode(reader);
                                                    continue;
                                                case 113:
                                                    boolDecode11 = ProtoAdapter.BOOL.decode(reader);
                                                    continue;
                                                case 114:
                                                    boolDecode12 = ProtoAdapter.BOOL.decode(reader);
                                                    continue;
                                                default:
                                                    switch (iG) {
                                                        case 116:
                                                            boolDecode13 = ProtoAdapter.BOOL.decode(reader);
                                                            continue;
                                                        case 117:
                                                            boolDecode14 = ProtoAdapter.BOOL.decode(reader);
                                                            continue;
                                                        case 118:
                                                            boolDecode15 = ProtoAdapter.BOOL.decode(reader);
                                                            continue;
                                                        default:
                                                            reader.m(iG);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            cVarDecode = cVarDecode;
                            zBooleanValue = zBooleanValue;
                            zBooleanValue2 = zBooleanValue2;
                            break;
                    }
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getDoor_open_driver_front_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getDoor_open_driver_front_OBSOLETE()));
            }
            if (value.getDoor_open_driver_rear_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getDoor_open_driver_rear_OBSOLETE()));
            }
            if (value.getDoor_open_passenger_front_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getDoor_open_passenger_front_OBSOLETE()));
            }
            if (value.getDoor_open_passenger_rear_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getDoor_open_passenger_rear_OBSOLETE()));
            }
            if (value.getDoor_open_trunk_front_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getDoor_open_trunk_front_OBSOLETE()));
            }
            if (value.getDoor_open_trunk_rear_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getDoor_open_trunk_rear_OBSOLETE()));
            }
            if (value.getWindow_open_driver_front_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getWindow_open_driver_front_OBSOLETE()));
            }
            if (value.getWindow_open_passenger_front_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getWindow_open_passenger_front_OBSOLETE()));
            }
            if (value.getWindow_open_driver_rear_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getWindow_open_driver_rear_OBSOLETE()));
            }
            if (value.getWindow_open_passenger_rear_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.getWindow_open_passenger_rear_OBSOLETE()));
            }
            if (value.getSun_roof_percent_open_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 12, Integer.valueOf(value.getSun_roof_percent_open_OBSOLETE()));
            }
            if (value.getLocked_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.getLocked_OBSOLETE()));
            }
            if (value.getIs_user_present_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 14, Boolean.valueOf(value.getIs_user_present_OBSOLETE()));
            }
            if (value.getRemote_start_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 16, Boolean.valueOf(value.getRemote_start_OBSOLETE()));
            }
            if (value.getValet_mode_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 17, Boolean.valueOf(value.getValet_mode_OBSOLETE()));
            }
            if (value.getValet_pin_needed_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 18, Boolean.valueOf(value.getValet_pin_needed_OBSOLETE()));
            }
            if (value.getSentry_mode_available_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 20, Boolean.valueOf(value.getSentry_mode_available_OBSOLETE()));
            }
            if (value.getSun_roof_state() != null) {
                e.f68431h.encodeWithTag(writer, 11, value.getSun_roof_state());
            }
            if (value.getCenter_display_state() != null) {
                c.f68411l.encodeWithTag(writer, 15, value.getCenter_display_state());
            }
            if (value.getSentry_mode_state() != null) {
                d.f68423h.encodeWithTag(writer, 19, value.getSentry_mode_state());
            }
            if (value.getSpeed_limit_mode() != null) {
                p0.f68303l.encodeWithTag(writer, 22, value.getSpeed_limit_mode());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2000, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 101, value.getDoor_open_driver_front());
            protoAdapter.encodeWithTag(writer, 102, value.getDoor_open_driver_rear());
            protoAdapter.encodeWithTag(writer, 103, value.getDoor_open_passenger_front());
            protoAdapter.encodeWithTag(writer, 104, value.getDoor_open_passenger_rear());
            protoAdapter.encodeWithTag(writer, 105, value.getDoor_open_trunk_front());
            protoAdapter.encodeWithTag(writer, 106, value.getDoor_open_trunk_rear());
            protoAdapter.encodeWithTag(writer, 107, value.getWindow_open_driver_front());
            protoAdapter.encodeWithTag(writer, 108, value.getWindow_open_passenger_front());
            protoAdapter.encodeWithTag(writer, 109, value.getWindow_open_driver_rear());
            protoAdapter.encodeWithTag(writer, 110, value.getWindow_open_passenger_rear());
            ProtoAdapter.INT32.encodeWithTag(writer, 112, value.getSun_roof_percent_open());
            protoAdapter.encodeWithTag(writer, 113, value.getLocked());
            protoAdapter.encodeWithTag(writer, 114, value.getIs_user_present());
            protoAdapter.encodeWithTag(writer, 116, value.getRemote_start());
            protoAdapter.encodeWithTag(writer, 117, value.getValet_mode());
            protoAdapter.encodeWithTag(writer, 118, value.getValet_pin_needed());
            protoAdapter.encodeWithTag(writer, 120, value.getSentry_mode_available());
            vc0.g0.ADAPTER.encodeWithTag(writer, 23, value.getTonneau_state());
            ProtoAdapter.UINT32.encodeWithTag(writer, 24, value.getTonneau_percent_open());
            protoAdapter.encodeWithTag(writer, 25, value.getTonneau_in_motion());
            protoAdapter.encodeWithTag(writer, 26, value.getHas_automatic_tonneau());
            protoAdapter.encodeWithTag(writer, 27, value.getHas_side_storage_doors());
            protoAdapter.encodeWithTag(writer, 28, value.getDoor_open_side_storage_left());
            protoAdapter.encodeWithTag(writer, 29, value.getDoor_open_side_storage_right());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getDoor_open_driver_front_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getDoor_open_driver_front_OBSOLETE()));
            }
            if (value.getDoor_open_driver_rear_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getDoor_open_driver_rear_OBSOLETE()));
            }
            if (value.getDoor_open_passenger_front_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getDoor_open_passenger_front_OBSOLETE()));
            }
            if (value.getDoor_open_passenger_rear_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getDoor_open_passenger_rear_OBSOLETE()));
            }
            if (value.getDoor_open_trunk_front_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getDoor_open_trunk_front_OBSOLETE()));
            }
            if (value.getDoor_open_trunk_rear_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getDoor_open_trunk_rear_OBSOLETE()));
            }
            if (value.getWindow_open_driver_front_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getWindow_open_driver_front_OBSOLETE()));
            }
            if (value.getWindow_open_passenger_front_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getWindow_open_passenger_front_OBSOLETE()));
            }
            if (value.getWindow_open_driver_rear_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getWindow_open_driver_rear_OBSOLETE()));
            }
            if (value.getWindow_open_passenger_rear_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getWindow_open_passenger_rear_OBSOLETE()));
            }
            if (value.getSun_roof_percent_open_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(12, Integer.valueOf(value.getSun_roof_percent_open_OBSOLETE()));
            }
            if (value.getLocked_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getLocked_OBSOLETE()));
            }
            if (value.getIs_user_present_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.getIs_user_present_OBSOLETE()));
            }
            if (value.getRemote_start_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.getRemote_start_OBSOLETE()));
            }
            if (value.getValet_mode_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.getValet_mode_OBSOLETE()));
            }
            if (value.getValet_pin_needed_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.getValet_pin_needed_OBSOLETE()));
            }
            if (value.getSentry_mode_available_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.getSentry_mode_available_OBSOLETE()));
            }
            if (value.getSun_roof_state() != null) {
                iD += e.f68431h.encodedSizeWithTag(11, value.getSun_roof_state());
            }
            if (value.getCenter_display_state() != null) {
                iD += c.f68411l.encodedSizeWithTag(15, value.getCenter_display_state());
            }
            if (value.getSentry_mode_state() != null) {
                iD += d.f68423h.encodedSizeWithTag(19, value.getSentry_mode_state());
            }
            if (value.getSpeed_limit_mode() != null) {
                iD += p0.f68303l.encodedSizeWithTag(22, value.getSpeed_limit_mode());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(2000, value.getTimestamp());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iD + protoAdapter.encodedSizeWithTag(101, value.getDoor_open_driver_front()) + protoAdapter.encodedSizeWithTag(102, value.getDoor_open_driver_rear()) + protoAdapter.encodedSizeWithTag(103, value.getDoor_open_passenger_front()) + protoAdapter.encodedSizeWithTag(104, value.getDoor_open_passenger_rear()) + protoAdapter.encodedSizeWithTag(105, value.getDoor_open_trunk_front()) + protoAdapter.encodedSizeWithTag(106, value.getDoor_open_trunk_rear()) + protoAdapter.encodedSizeWithTag(107, value.getWindow_open_driver_front()) + protoAdapter.encodedSizeWithTag(108, value.getWindow_open_passenger_front()) + protoAdapter.encodedSizeWithTag(109, value.getWindow_open_driver_rear()) + protoAdapter.encodedSizeWithTag(110, value.getWindow_open_passenger_rear()) + ProtoAdapter.INT32.encodedSizeWithTag(112, value.getSun_roof_percent_open()) + protoAdapter.encodedSizeWithTag(113, value.getLocked()) + protoAdapter.encodedSizeWithTag(114, value.getIs_user_present()) + protoAdapter.encodedSizeWithTag(116, value.getRemote_start()) + protoAdapter.encodedSizeWithTag(117, value.getValet_mode()) + protoAdapter.encodedSizeWithTag(118, value.getValet_pin_needed()) + protoAdapter.encodedSizeWithTag(120, value.getSentry_mode_available()) + vc0.g0.ADAPTER.encodedSizeWithTag(23, value.getTonneau_state()) + ProtoAdapter.UINT32.encodedSizeWithTag(24, value.getTonneau_percent_open()) + protoAdapter.encodedSizeWithTag(25, value.getTonneau_in_motion()) + protoAdapter.encodedSizeWithTag(26, value.getHas_automatic_tonneau()) + protoAdapter.encodedSizeWithTag(27, value.getHas_side_storage_doors()) + protoAdapter.encodedSizeWithTag(28, value.getDoor_open_side_storage_left()) + protoAdapter.encodedSizeWithTag(29, value.getDoor_open_side_storage_right());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r redact(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            e sun_roof_state = value.getSun_roof_state();
            e eVarRedact = sun_roof_state != null ? e.f68431h.redact(sun_roof_state) : null;
            c center_display_state = value.getCenter_display_state();
            c cVarRedact = center_display_state != null ? c.f68411l.redact(center_display_state) : null;
            d sentry_mode_state = value.getSentry_mode_state();
            d dVarRedact = sentry_mode_state != null ? d.f68423h.redact(sentry_mode_state) : null;
            p0 speed_limit_mode = value.getSpeed_limit_mode();
            p0 p0VarRedact = speed_limit_mode != null ? p0.f68303l.redact(speed_limit_mode) : null;
            Instant timestamp = value.getTimestamp();
            return r.b(value, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, eVarRedact, cVarRedact, dVarRedact, p0VarRedact, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, -4063233, 16383, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0089\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u008f\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b(\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b*\u0010#¨\u0006-"}, d2 = {"Lgc0/r$c;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Off", "Dim", "Accessory", "On", "Driving", "Charging", "Lock", "Sentry", "Dog", "Entertainment", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/r$c;", "Lec0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()Lec0/h0;", "b", DateTokenConverter.CONVERTER_KEY, "c", "j", "e", "f", "g", "h", "k", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final ProtoAdapter<c> f68411l = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Off;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Dim;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 Accessory;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
        private final ec0.h0 On;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
        private final ec0.h0 Driving;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
        private final ec0.h0 Charging;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
        private final ec0.h0 Lock;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
        private final ec0.h0 Sentry;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
        private final ec0.h0 Dog;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)
        private final ec0.h0 Entertainment;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/r$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/r$c;", "value", "", "c", "(Lgc0/r$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/r$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/r$c;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/r$c;)Lgc0/r$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState.DisplayState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                ec0.h0 h0VarDecode5 = null;
                ec0.h0 h0VarDecode6 = null;
                ec0.h0 h0VarDecode7 = null;
                ec0.h0 h0VarDecode8 = null;
                ec0.h0 h0VarDecode9 = null;
                ec0.h0 h0VarDecode10 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, h0VarDecode10, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            h0VarDecode = ec0.h0.f62622b.decode(reader);
                            break;
                        case 2:
                            h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 3:
                            h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 4:
                            h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 5:
                            h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 6:
                            h0VarDecode6 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 7:
                            h0VarDecode7 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 8:
                            h0VarDecode8 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 9:
                            h0VarDecode9 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 10:
                            h0VarDecode10 = ec0.h0.f62622b.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getOff());
                protoAdapter.encodeWithTag(writer, 2, value.getDim());
                protoAdapter.encodeWithTag(writer, 3, value.getAccessory());
                protoAdapter.encodeWithTag(writer, 4, value.getOn());
                protoAdapter.encodeWithTag(writer, 5, value.getDriving());
                protoAdapter.encodeWithTag(writer, 6, value.getCharging());
                protoAdapter.encodeWithTag(writer, 7, value.getLock());
                protoAdapter.encodeWithTag(writer, 8, value.getSentry());
                protoAdapter.encodeWithTag(writer, 9, value.getDog());
                protoAdapter.encodeWithTag(writer, 10, value.getEntertainment());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getOff()) + protoAdapter.encodedSizeWithTag(2, value.getDim()) + protoAdapter.encodedSizeWithTag(3, value.getAccessory()) + protoAdapter.encodedSizeWithTag(4, value.getOn()) + protoAdapter.encodedSizeWithTag(5, value.getDriving()) + protoAdapter.encodedSizeWithTag(6, value.getCharging()) + protoAdapter.encodedSizeWithTag(7, value.getLock()) + protoAdapter.encodedSizeWithTag(8, value.getSentry()) + protoAdapter.encodedSizeWithTag(9, value.getDog()) + protoAdapter.encodedSizeWithTag(10, value.getEntertainment());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 off = value.getOff();
                ec0.h0 h0VarRedact = off != null ? ec0.h0.f62622b.redact(off) : null;
                ec0.h0 dim = value.getDim();
                ec0.h0 h0VarRedact2 = dim != null ? ec0.h0.f62622b.redact(dim) : null;
                ec0.h0 accessory = value.getAccessory();
                ec0.h0 h0VarRedact3 = accessory != null ? ec0.h0.f62622b.redact(accessory) : null;
                ec0.h0 on2 = value.getOn();
                ec0.h0 h0VarRedact4 = on2 != null ? ec0.h0.f62622b.redact(on2) : null;
                ec0.h0 driving = value.getDriving();
                ec0.h0 h0VarRedact5 = driving != null ? ec0.h0.f62622b.redact(driving) : null;
                ec0.h0 charging = value.getCharging();
                ec0.h0 h0VarRedact6 = charging != null ? ec0.h0.f62622b.redact(charging) : null;
                ec0.h0 lock = value.getLock();
                ec0.h0 h0VarRedact7 = lock != null ? ec0.h0.f62622b.redact(lock) : null;
                ec0.h0 sentry = value.getSentry();
                ec0.h0 h0VarRedact8 = sentry != null ? ec0.h0.f62622b.redact(sentry) : null;
                ec0.h0 dog = value.getDog();
                ec0.h0 h0VarRedact9 = dog != null ? ec0.h0.f62622b.redact(dog) : null;
                ec0.h0 entertainment = value.getEntertainment();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, h0VarRedact9, entertainment != null ? ec0.h0.f62622b.redact(entertainment) : null, okio.k.f97943e);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public final c a(ec0.h0 Off, ec0.h0 Dim, ec0.h0 Accessory, ec0.h0 On, ec0.h0 Driving, ec0.h0 Charging, ec0.h0 Lock, ec0.h0 Sentry, ec0.h0 Dog, ec0.h0 Entertainment, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(Off, Dim, Accessory, On, Driving, Charging, Lock, Sentry, Dog, Entertainment, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getAccessory() {
            return this.Accessory;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getCharging() {
            return this.Charging;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getDim() {
            return this.Dim;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getDog() {
            return this.Dog;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Off, cVar.Off) && p013kotlin.jvm.internal.s.f(this.Dim, cVar.Dim) && p013kotlin.jvm.internal.s.f(this.Accessory, cVar.Accessory) && p013kotlin.jvm.internal.s.f(this.On, cVar.On) && p013kotlin.jvm.internal.s.f(this.Driving, cVar.Driving) && p013kotlin.jvm.internal.s.f(this.Charging, cVar.Charging) && p013kotlin.jvm.internal.s.f(this.Lock, cVar.Lock) && p013kotlin.jvm.internal.s.f(this.Sentry, cVar.Sentry) && p013kotlin.jvm.internal.s.f(this.Dog, cVar.Dog) && p013kotlin.jvm.internal.s.f(this.Entertainment, cVar.Entertainment);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ec0.h0 getDriving() {
            return this.Driving;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ec0.h0 getEntertainment() {
            return this.Entertainment;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ec0.h0 getLock() {
            return this.Lock;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Off;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Dim;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.Accessory;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.On;
            int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
            ec0.h0 h0Var5 = this.Driving;
            int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
            ec0.h0 h0Var6 = this.Charging;
            int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
            ec0.h0 h0Var7 = this.Lock;
            int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
            ec0.h0 h0Var8 = this.Sentry;
            int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
            ec0.h0 h0Var9 = this.Dog;
            int iHashCode10 = (iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0)) * 37;
            ec0.h0 h0Var10 = this.Entertainment;
            int iHashCode11 = iHashCode10 + (h0Var10 != null ? h0Var10.hashCode() : 0);
            this.hashCode = iHashCode11;
            return iHashCode11;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ec0.h0 getOff() {
            return this.Off;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ec0.h0 getOn() {
            return this.On;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ec0.h0 getSentry() {
            return this.Sentry;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m433newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Off;
            if (h0Var != null) {
                arrayList.add("Off=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Dim;
            if (h0Var2 != null) {
                arrayList.add("Dim=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.Accessory;
            if (h0Var3 != null) {
                arrayList.add("Accessory=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.On;
            if (h0Var4 != null) {
                arrayList.add("On=" + h0Var4);
            }
            ec0.h0 h0Var5 = this.Driving;
            if (h0Var5 != null) {
                arrayList.add("Driving=" + h0Var5);
            }
            ec0.h0 h0Var6 = this.Charging;
            if (h0Var6 != null) {
                arrayList.add("Charging=" + h0Var6);
            }
            ec0.h0 h0Var7 = this.Lock;
            if (h0Var7 != null) {
                arrayList.add("Lock=" + h0Var7);
            }
            ec0.h0 h0Var8 = this.Sentry;
            if (h0Var8 != null) {
                arrayList.add("Sentry=" + h0Var8);
            }
            ec0.h0 h0Var9 = this.Dog;
            if (h0Var9 != null) {
                arrayList.add("Dog=" + h0Var9);
            }
            ec0.h0 h0Var10 = this.Entertainment;
            if (h0Var10 != null) {
                arrayList.add("Entertainment=" + h0Var10);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "DisplayState{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, ec0.h0 h0Var7, ec0.h0 h0Var8, ec0.h0 h0Var9, ec0.h0 h0Var10, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? null : h0Var10, (i11 & 1024) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m433newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, ec0.h0 h0Var7, ec0.h0 h0Var8, ec0.h0 h0Var9, ec0.h0 h0Var10, okio.k unknownFields) {
            super(f68411l, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Off = h0Var;
            this.Dim = h0Var2;
            this.Accessory = h0Var3;
            this.On = h0Var4;
            this.Driving = h0Var5;
            this.Charging = h0Var6;
            this.Lock = h0Var7;
            this.Sentry = h0Var8;
            this.Dog = h0Var9;
            this.Entertainment = h0Var10;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10) > 1) {
                throw new IllegalArgumentException("At most one of Off, Dim, Accessory, On, Driving, Charging, Lock, Sentry, Dog, Entertainment may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ_\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lgc0/r$d;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Off", "Idle", "Armed", "Aware", "Panic", "Quiet", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/r$d;", "Lec0/h0;", "e", "()Lec0/h0;", "b", DateTokenConverter.CONVERTER_KEY, "c", "f", "g", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends com.squareup.wire.f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final ProtoAdapter<d> f68423h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Off;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Idle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 Armed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
        private final ec0.h0 Aware;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
        private final ec0.h0 Panic;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
        private final ec0.h0 Quiet;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/r$d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/r$d;", "value", "", "c", "(Lgc0/r$d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/r$d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/r$d;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/r$d;)Lgc0/r$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, co0.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState.SentryModeState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                ec0.h0 h0VarDecode5 = null;
                ec0.h0 h0VarDecode6 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new d(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            h0VarDecode = ec0.h0.f62622b.decode(reader);
                            break;
                        case 2:
                            h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 3:
                            h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 4:
                            h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 5:
                            h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 6:
                            h0VarDecode6 = ec0.h0.f62622b.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, d value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getOff());
                protoAdapter.encodeWithTag(writer, 2, value.getIdle());
                protoAdapter.encodeWithTag(writer, 3, value.getArmed());
                protoAdapter.encodeWithTag(writer, 4, value.getAware());
                protoAdapter.encodeWithTag(writer, 5, value.getPanic());
                protoAdapter.encodeWithTag(writer, 6, value.getQuiet());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getOff()) + protoAdapter.encodedSizeWithTag(2, value.getIdle()) + protoAdapter.encodedSizeWithTag(3, value.getArmed()) + protoAdapter.encodedSizeWithTag(4, value.getAware()) + protoAdapter.encodedSizeWithTag(5, value.getPanic()) + protoAdapter.encodedSizeWithTag(6, value.getQuiet());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public d redact(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 off = value.getOff();
                ec0.h0 h0VarRedact = off != null ? ec0.h0.f62622b.redact(off) : null;
                ec0.h0 idle = value.getIdle();
                ec0.h0 h0VarRedact2 = idle != null ? ec0.h0.f62622b.redact(idle) : null;
                ec0.h0 armed = value.getArmed();
                ec0.h0 h0VarRedact3 = armed != null ? ec0.h0.f62622b.redact(armed) : null;
                ec0.h0 aware = value.getAware();
                ec0.h0 h0VarRedact4 = aware != null ? ec0.h0.f62622b.redact(aware) : null;
                ec0.h0 panic = value.getPanic();
                ec0.h0 h0VarRedact5 = panic != null ? ec0.h0.f62622b.redact(panic) : null;
                ec0.h0 quiet = value.getQuiet();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, quiet != null ? ec0.h0.f62622b.redact(quiet) : null, okio.k.f97943e);
            }
        }

        public d() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final d a(ec0.h0 Off, ec0.h0 Idle, ec0.h0 Armed, ec0.h0 Aware, ec0.h0 Panic, ec0.h0 Quiet, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new d(Off, Idle, Armed, Aware, Panic, Quiet, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getArmed() {
            return this.Armed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getAware() {
            return this.Aware;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getIdle() {
            return this.Idle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getOff() {
            return this.Off;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), dVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Off, dVar.Off) && p013kotlin.jvm.internal.s.f(this.Idle, dVar.Idle) && p013kotlin.jvm.internal.s.f(this.Armed, dVar.Armed) && p013kotlin.jvm.internal.s.f(this.Aware, dVar.Aware) && p013kotlin.jvm.internal.s.f(this.Panic, dVar.Panic) && p013kotlin.jvm.internal.s.f(this.Quiet, dVar.Quiet);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ec0.h0 getPanic() {
            return this.Panic;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ec0.h0 getQuiet() {
            return this.Quiet;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Off;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Idle;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.Armed;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.Aware;
            int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
            ec0.h0 h0Var5 = this.Panic;
            int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
            ec0.h0 h0Var6 = this.Quiet;
            int iHashCode7 = iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0);
            this.hashCode = iHashCode7;
            return iHashCode7;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m434newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Off;
            if (h0Var != null) {
                arrayList.add("Off=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Idle;
            if (h0Var2 != null) {
                arrayList.add("Idle=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.Armed;
            if (h0Var3 != null) {
                arrayList.add("Armed=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.Aware;
            if (h0Var4 != null) {
                arrayList.add("Aware=" + h0Var4);
            }
            ec0.h0 h0Var5 = this.Panic;
            if (h0Var5 != null) {
                arrayList.add("Panic=" + h0Var5);
            }
            ec0.h0 h0Var6 = this.Quiet;
            if (h0Var6 != null) {
                arrayList.add("Quiet=" + h0Var6);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "SentryModeState{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ d(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m434newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, okio.k unknownFields) {
            super(f68423h, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Off = h0Var;
            this.Idle = h0Var2;
            this.Armed = h0Var3;
            this.Aware = h0Var4;
            this.Panic = h0Var5;
            this.Quiet = h0Var6;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6) > 1) {
                throw new IllegalArgumentException("At most one of Off, Idle, Armed, Aware, Panic, Quiet may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ_\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lgc0/r$e;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Unknown", "Calibrating", "Closed", "Open", "Moving", "Vent", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/r$e;", "Lec0/h0;", "f", "()Lec0/h0;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "g", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends com.squareup.wire.f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final ProtoAdapter<e> f68431h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Unknown;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Calibrating;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 Closed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
        private final ec0.h0 Open;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
        private final ec0.h0 Moving;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
        private final ec0.h0 Vent;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/r$e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/r$e;", "value", "", "c", "(Lgc0/r$e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/r$e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/r$e;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/r$e;)Lgc0/r$e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState.SunRoofState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                ec0.h0 h0VarDecode5 = null;
                ec0.h0 h0VarDecode6 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new e(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            h0VarDecode = ec0.h0.f62622b.decode(reader);
                            break;
                        case 2:
                            h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 3:
                            h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 4:
                            h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 5:
                            h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 6:
                            h0VarDecode6 = ec0.h0.f62622b.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, e value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getUnknown());
                protoAdapter.encodeWithTag(writer, 2, value.getCalibrating());
                protoAdapter.encodeWithTag(writer, 3, value.getClosed());
                protoAdapter.encodeWithTag(writer, 4, value.getOpen());
                protoAdapter.encodeWithTag(writer, 5, value.getMoving());
                protoAdapter.encodeWithTag(writer, 6, value.getVent());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(e value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getUnknown()) + protoAdapter.encodedSizeWithTag(2, value.getCalibrating()) + protoAdapter.encodedSizeWithTag(3, value.getClosed()) + protoAdapter.encodedSizeWithTag(4, value.getOpen()) + protoAdapter.encodedSizeWithTag(5, value.getMoving()) + protoAdapter.encodedSizeWithTag(6, value.getVent());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public e redact(e value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 unknown = value.getUnknown();
                ec0.h0 h0VarRedact = unknown != null ? ec0.h0.f62622b.redact(unknown) : null;
                ec0.h0 calibrating = value.getCalibrating();
                ec0.h0 h0VarRedact2 = calibrating != null ? ec0.h0.f62622b.redact(calibrating) : null;
                ec0.h0 closed = value.getClosed();
                ec0.h0 h0VarRedact3 = closed != null ? ec0.h0.f62622b.redact(closed) : null;
                ec0.h0 open = value.getOpen();
                ec0.h0 h0VarRedact4 = open != null ? ec0.h0.f62622b.redact(open) : null;
                ec0.h0 moving = value.getMoving();
                ec0.h0 h0VarRedact5 = moving != null ? ec0.h0.f62622b.redact(moving) : null;
                ec0.h0 vent = value.getVent();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, vent != null ? ec0.h0.f62622b.redact(vent) : null, okio.k.f97943e);
            }
        }

        public e() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final e a(ec0.h0 Unknown, ec0.h0 Calibrating, ec0.h0 Closed, ec0.h0 Open, ec0.h0 Moving, ec0.h0 Vent, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new e(Unknown, Calibrating, Closed, Open, Moving, Vent, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getCalibrating() {
            return this.Calibrating;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getClosed() {
            return this.Closed;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getMoving() {
            return this.Moving;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getOpen() {
            return this.Open;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), eVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Unknown, eVar.Unknown) && p013kotlin.jvm.internal.s.f(this.Calibrating, eVar.Calibrating) && p013kotlin.jvm.internal.s.f(this.Closed, eVar.Closed) && p013kotlin.jvm.internal.s.f(this.Open, eVar.Open) && p013kotlin.jvm.internal.s.f(this.Moving, eVar.Moving) && p013kotlin.jvm.internal.s.f(this.Vent, eVar.Vent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ec0.h0 getUnknown() {
            return this.Unknown;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ec0.h0 getVent() {
            return this.Vent;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Unknown;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Calibrating;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.Closed;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.Open;
            int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
            ec0.h0 h0Var5 = this.Moving;
            int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
            ec0.h0 h0Var6 = this.Vent;
            int iHashCode7 = iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0);
            this.hashCode = iHashCode7;
            return iHashCode7;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m435newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Unknown;
            if (h0Var != null) {
                arrayList.add("Unknown=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Calibrating;
            if (h0Var2 != null) {
                arrayList.add("Calibrating=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.Closed;
            if (h0Var3 != null) {
                arrayList.add("Closed=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.Open;
            if (h0Var4 != null) {
                arrayList.add("Open=" + h0Var4);
            }
            ec0.h0 h0Var5 = this.Moving;
            if (h0Var5 != null) {
                arrayList.add("Moving=" + h0Var5);
            }
            ec0.h0 h0Var6 = this.Vent;
            if (h0Var6 != null) {
                arrayList.add("Vent=" + h0Var6);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "SunRoofState{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ e(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m435newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, okio.k unknownFields) {
            super(f68431h, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Unknown = h0Var;
            this.Calibrating = h0Var2;
            this.Closed = h0Var3;
            this.Open = h0Var4;
            this.Moving = h0Var5;
            this.Vent = h0Var6;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6) > 1) {
                throw new IllegalArgumentException("At most one of Unknown, Calibrating, Closed, Open, Moving, Vent may be non-null");
            }
        }
    }

    public r() {
        this(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
    }

    public static /* synthetic */ r b(r rVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, e eVar, c cVar, d dVar, p0 p0Var, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, vc0.g0 g0Var, Integer num2, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, okio.k kVar, int i12, int i13, Object obj) {
        return rVar.a((i12 & 1) != 0 ? rVar.door_open_driver_front_OBSOLETE : z11, (i12 & 2) != 0 ? rVar.door_open_driver_rear_OBSOLETE : z12, (i12 & 4) != 0 ? rVar.door_open_passenger_front_OBSOLETE : z13, (i12 & 8) != 0 ? rVar.door_open_passenger_rear_OBSOLETE : z14, (i12 & 16) != 0 ? rVar.door_open_trunk_front_OBSOLETE : z15, (i12 & 32) != 0 ? rVar.door_open_trunk_rear_OBSOLETE : z16, (i12 & 64) != 0 ? rVar.window_open_driver_front_OBSOLETE : z17, (i12 & 128) != 0 ? rVar.window_open_passenger_front_OBSOLETE : z18, (i12 & 256) != 0 ? rVar.window_open_driver_rear_OBSOLETE : z19, (i12 & 512) != 0 ? rVar.window_open_passenger_rear_OBSOLETE : z21, (i12 & 1024) != 0 ? rVar.sun_roof_percent_open_OBSOLETE : i11, (i12 & 2048) != 0 ? rVar.locked_OBSOLETE : z22, (i12 & 4096) != 0 ? rVar.is_user_present_OBSOLETE : z23, (i12 & PKIFailureInfo.certRevoked) != 0 ? rVar.remote_start_OBSOLETE : z24, (i12 & 16384) != 0 ? rVar.valet_mode_OBSOLETE : z25, (i12 & 32768) != 0 ? rVar.valet_pin_needed_OBSOLETE : z26, (i12 & 65536) != 0 ? rVar.sentry_mode_available_OBSOLETE : z27, (i12 & 131072) != 0 ? rVar.sun_roof_state : eVar, (i12 & 262144) != 0 ? rVar.center_display_state : cVar, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? rVar.sentry_mode_state : dVar, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? rVar.speed_limit_mode : p0Var, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? rVar.timestamp : instant, (i12 & 4194304) != 0 ? rVar.door_open_driver_front : bool, (i12 & 8388608) != 0 ? rVar.door_open_driver_rear : bool2, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? rVar.door_open_passenger_front : bool3, (i12 & 33554432) != 0 ? rVar.door_open_passenger_rear : bool4, (i12 & 67108864) != 0 ? rVar.door_open_trunk_front : bool5, (i12 & 134217728) != 0 ? rVar.door_open_trunk_rear : bool6, (i12 & 268435456) != 0 ? rVar.window_open_driver_front : bool7, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? rVar.window_open_passenger_front : bool8, (i12 & 1073741824) != 0 ? rVar.window_open_driver_rear : bool9, (i12 & Integer.MIN_VALUE) != 0 ? rVar.window_open_passenger_rear : bool10, (i13 & 1) != 0 ? rVar.sun_roof_percent_open : num, (i13 & 2) != 0 ? rVar.locked : bool11, (i13 & 4) != 0 ? rVar.is_user_present : bool12, (i13 & 8) != 0 ? rVar.remote_start : bool13, (i13 & 16) != 0 ? rVar.valet_mode : bool14, (i13 & 32) != 0 ? rVar.valet_pin_needed : bool15, (i13 & 64) != 0 ? rVar.sentry_mode_available : bool16, (i13 & 128) != 0 ? rVar.tonneau_state : g0Var, (i13 & 256) != 0 ? rVar.tonneau_percent_open : num2, (i13 & 512) != 0 ? rVar.tonneau_in_motion : bool17, (i13 & 1024) != 0 ? rVar.has_automatic_tonneau : bool18, (i13 & 2048) != 0 ? rVar.has_side_storage_doors : bool19, (i13 & 4096) != 0 ? rVar.door_open_side_storage_left : bool20, (i13 & PKIFailureInfo.certRevoked) != 0 ? rVar.door_open_side_storage_right : bool21, (i13 & 16384) != 0 ? rVar.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final p0 getSpeed_limit_mode() {
        return this.speed_limit_mode;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Integer getSun_roof_percent_open() {
        return this.sun_roof_percent_open;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getSun_roof_percent_open_OBSOLETE() {
        return this.sun_roof_percent_open_OBSOLETE;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final e getSun_roof_state() {
        return this.sun_roof_state;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Boolean getTonneau_in_motion() {
        return this.tonneau_in_motion;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Integer getTonneau_percent_open() {
        return this.tonneau_percent_open;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final vc0.g0 getTonneau_state() {
        return this.tonneau_state;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getValet_mode() {
        return this.valet_mode;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getValet_mode_OBSOLETE() {
        return this.valet_mode_OBSOLETE;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Boolean getValet_pin_needed() {
        return this.valet_pin_needed;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getValet_pin_needed_OBSOLETE() {
        return this.valet_pin_needed_OBSOLETE;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Boolean getWindow_open_driver_front() {
        return this.window_open_driver_front;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final boolean getWindow_open_driver_front_OBSOLETE() {
        return this.window_open_driver_front_OBSOLETE;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Boolean getWindow_open_driver_rear() {
        return this.window_open_driver_rear;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final boolean getWindow_open_driver_rear_OBSOLETE() {
        return this.window_open_driver_rear_OBSOLETE;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Boolean getWindow_open_passenger_front() {
        return this.window_open_passenger_front;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean getWindow_open_passenger_front_OBSOLETE() {
        return this.window_open_passenger_front_OBSOLETE;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final Boolean getWindow_open_passenger_rear() {
        return this.window_open_passenger_rear;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getWindow_open_passenger_rear_OBSOLETE() {
        return this.window_open_passenger_rear_OBSOLETE;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Boolean getIs_user_present() {
        return this.is_user_present;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final boolean getIs_user_present_OBSOLETE() {
        return this.is_user_present_OBSOLETE;
    }

    public final r a(boolean door_open_driver_front_OBSOLETE, boolean door_open_driver_rear_OBSOLETE, boolean door_open_passenger_front_OBSOLETE, boolean door_open_passenger_rear_OBSOLETE, boolean door_open_trunk_front_OBSOLETE, boolean door_open_trunk_rear_OBSOLETE, boolean window_open_driver_front_OBSOLETE, boolean window_open_passenger_front_OBSOLETE, boolean window_open_driver_rear_OBSOLETE, boolean window_open_passenger_rear_OBSOLETE, int sun_roof_percent_open_OBSOLETE, boolean locked_OBSOLETE, boolean is_user_present_OBSOLETE, boolean remote_start_OBSOLETE, boolean valet_mode_OBSOLETE, boolean valet_pin_needed_OBSOLETE, boolean sentry_mode_available_OBSOLETE, e sun_roof_state, c center_display_state, d sentry_mode_state, p0 speed_limit_mode, Instant timestamp, Boolean door_open_driver_front, Boolean door_open_driver_rear, Boolean door_open_passenger_front, Boolean door_open_passenger_rear, Boolean door_open_trunk_front, Boolean door_open_trunk_rear, Boolean window_open_driver_front, Boolean window_open_passenger_front, Boolean window_open_driver_rear, Boolean window_open_passenger_rear, Integer sun_roof_percent_open, Boolean locked, Boolean is_user_present, Boolean remote_start, Boolean valet_mode, Boolean valet_pin_needed, Boolean sentry_mode_available, vc0.g0 tonneau_state, Integer tonneau_percent_open, Boolean tonneau_in_motion, Boolean has_automatic_tonneau, Boolean has_side_storage_doors, Boolean door_open_side_storage_left, Boolean door_open_side_storage_right, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r(door_open_driver_front_OBSOLETE, door_open_driver_rear_OBSOLETE, door_open_passenger_front_OBSOLETE, door_open_passenger_rear_OBSOLETE, door_open_trunk_front_OBSOLETE, door_open_trunk_rear_OBSOLETE, window_open_driver_front_OBSOLETE, window_open_passenger_front_OBSOLETE, window_open_driver_rear_OBSOLETE, window_open_passenger_rear_OBSOLETE, sun_roof_percent_open_OBSOLETE, locked_OBSOLETE, is_user_present_OBSOLETE, remote_start_OBSOLETE, valet_mode_OBSOLETE, valet_pin_needed_OBSOLETE, sentry_mode_available_OBSOLETE, sun_roof_state, center_display_state, sentry_mode_state, speed_limit_mode, timestamp, door_open_driver_front, door_open_driver_rear, door_open_passenger_front, door_open_passenger_rear, door_open_trunk_front, door_open_trunk_rear, window_open_driver_front, window_open_passenger_front, window_open_driver_rear, window_open_passenger_rear, sun_roof_percent_open, locked, is_user_present, remote_start, valet_mode, valet_pin_needed, sentry_mode_available, tonneau_state, tonneau_percent_open, tonneau_in_motion, has_automatic_tonneau, has_side_storage_doors, door_open_side_storage_left, door_open_side_storage_right, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getCenter_display_state() {
        return this.center_display_state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getDoor_open_driver_front() {
        return this.door_open_driver_front;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDoor_open_driver_front_OBSOLETE() {
        return this.door_open_driver_front_OBSOLETE;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), rVar.unknownFields()) && this.door_open_driver_front_OBSOLETE == rVar.door_open_driver_front_OBSOLETE && this.door_open_driver_rear_OBSOLETE == rVar.door_open_driver_rear_OBSOLETE && this.door_open_passenger_front_OBSOLETE == rVar.door_open_passenger_front_OBSOLETE && this.door_open_passenger_rear_OBSOLETE == rVar.door_open_passenger_rear_OBSOLETE && this.door_open_trunk_front_OBSOLETE == rVar.door_open_trunk_front_OBSOLETE && this.door_open_trunk_rear_OBSOLETE == rVar.door_open_trunk_rear_OBSOLETE && this.window_open_driver_front_OBSOLETE == rVar.window_open_driver_front_OBSOLETE && this.window_open_passenger_front_OBSOLETE == rVar.window_open_passenger_front_OBSOLETE && this.window_open_driver_rear_OBSOLETE == rVar.window_open_driver_rear_OBSOLETE && this.window_open_passenger_rear_OBSOLETE == rVar.window_open_passenger_rear_OBSOLETE && this.sun_roof_percent_open_OBSOLETE == rVar.sun_roof_percent_open_OBSOLETE && this.locked_OBSOLETE == rVar.locked_OBSOLETE && this.is_user_present_OBSOLETE == rVar.is_user_present_OBSOLETE && this.remote_start_OBSOLETE == rVar.remote_start_OBSOLETE && this.valet_mode_OBSOLETE == rVar.valet_mode_OBSOLETE && this.valet_pin_needed_OBSOLETE == rVar.valet_pin_needed_OBSOLETE && this.sentry_mode_available_OBSOLETE == rVar.sentry_mode_available_OBSOLETE && p013kotlin.jvm.internal.s.f(this.sun_roof_state, rVar.sun_roof_state) && p013kotlin.jvm.internal.s.f(this.center_display_state, rVar.center_display_state) && p013kotlin.jvm.internal.s.f(this.sentry_mode_state, rVar.sentry_mode_state) && p013kotlin.jvm.internal.s.f(this.speed_limit_mode, rVar.speed_limit_mode) && p013kotlin.jvm.internal.s.f(this.timestamp, rVar.timestamp) && p013kotlin.jvm.internal.s.f(this.door_open_driver_front, rVar.door_open_driver_front) && p013kotlin.jvm.internal.s.f(this.door_open_driver_rear, rVar.door_open_driver_rear) && p013kotlin.jvm.internal.s.f(this.door_open_passenger_front, rVar.door_open_passenger_front) && p013kotlin.jvm.internal.s.f(this.door_open_passenger_rear, rVar.door_open_passenger_rear) && p013kotlin.jvm.internal.s.f(this.door_open_trunk_front, rVar.door_open_trunk_front) && p013kotlin.jvm.internal.s.f(this.door_open_trunk_rear, rVar.door_open_trunk_rear) && p013kotlin.jvm.internal.s.f(this.window_open_driver_front, rVar.window_open_driver_front) && p013kotlin.jvm.internal.s.f(this.window_open_passenger_front, rVar.window_open_passenger_front) && p013kotlin.jvm.internal.s.f(this.window_open_driver_rear, rVar.window_open_driver_rear) && p013kotlin.jvm.internal.s.f(this.window_open_passenger_rear, rVar.window_open_passenger_rear) && p013kotlin.jvm.internal.s.f(this.sun_roof_percent_open, rVar.sun_roof_percent_open) && p013kotlin.jvm.internal.s.f(this.locked, rVar.locked) && p013kotlin.jvm.internal.s.f(this.is_user_present, rVar.is_user_present) && p013kotlin.jvm.internal.s.f(this.remote_start, rVar.remote_start) && p013kotlin.jvm.internal.s.f(this.valet_mode, rVar.valet_mode) && p013kotlin.jvm.internal.s.f(this.valet_pin_needed, rVar.valet_pin_needed) && p013kotlin.jvm.internal.s.f(this.sentry_mode_available, rVar.sentry_mode_available) && this.tonneau_state == rVar.tonneau_state && p013kotlin.jvm.internal.s.f(this.tonneau_percent_open, rVar.tonneau_percent_open) && p013kotlin.jvm.internal.s.f(this.tonneau_in_motion, rVar.tonneau_in_motion) && p013kotlin.jvm.internal.s.f(this.has_automatic_tonneau, rVar.has_automatic_tonneau) && p013kotlin.jvm.internal.s.f(this.has_side_storage_doors, rVar.has_side_storage_doors) && p013kotlin.jvm.internal.s.f(this.door_open_side_storage_left, rVar.door_open_side_storage_left) && p013kotlin.jvm.internal.s.f(this.door_open_side_storage_right, rVar.door_open_side_storage_right);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getDoor_open_driver_rear() {
        return this.door_open_driver_rear;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDoor_open_driver_rear_OBSOLETE() {
        return this.door_open_driver_rear_OBSOLETE;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getDoor_open_passenger_front() {
        return this.door_open_passenger_front;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.door_open_driver_front_OBSOLETE)) * 37) + Boolean.hashCode(this.door_open_driver_rear_OBSOLETE)) * 37) + Boolean.hashCode(this.door_open_passenger_front_OBSOLETE)) * 37) + Boolean.hashCode(this.door_open_passenger_rear_OBSOLETE)) * 37) + Boolean.hashCode(this.door_open_trunk_front_OBSOLETE)) * 37) + Boolean.hashCode(this.door_open_trunk_rear_OBSOLETE)) * 37) + Boolean.hashCode(this.window_open_driver_front_OBSOLETE)) * 37) + Boolean.hashCode(this.window_open_passenger_front_OBSOLETE)) * 37) + Boolean.hashCode(this.window_open_driver_rear_OBSOLETE)) * 37) + Boolean.hashCode(this.window_open_passenger_rear_OBSOLETE)) * 37) + Integer.hashCode(this.sun_roof_percent_open_OBSOLETE)) * 37) + Boolean.hashCode(this.locked_OBSOLETE)) * 37) + Boolean.hashCode(this.is_user_present_OBSOLETE)) * 37) + Boolean.hashCode(this.remote_start_OBSOLETE)) * 37) + Boolean.hashCode(this.valet_mode_OBSOLETE)) * 37) + Boolean.hashCode(this.valet_pin_needed_OBSOLETE)) * 37) + Boolean.hashCode(this.sentry_mode_available_OBSOLETE)) * 37;
        e eVar = this.sun_roof_state;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 37;
        c cVar = this.center_display_state;
        int iHashCode3 = (iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 37;
        d dVar = this.sentry_mode_state;
        int iHashCode4 = (iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        p0 p0Var = this.speed_limit_mode;
        int iHashCode5 = (iHashCode4 + (p0Var != null ? p0Var.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode6 = (iHashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
        Boolean bool = this.door_open_driver_front;
        int iHashCode7 = (iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.door_open_driver_rear;
        int iHashCode8 = (iHashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.door_open_passenger_front;
        int iHashCode9 = (iHashCode8 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.door_open_passenger_rear;
        int iHashCode10 = (iHashCode9 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.door_open_trunk_front;
        int iHashCode11 = (iHashCode10 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.door_open_trunk_rear;
        int iHashCode12 = (iHashCode11 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.window_open_driver_front;
        int iHashCode13 = (iHashCode12 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.window_open_passenger_front;
        int iHashCode14 = (iHashCode13 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Boolean bool9 = this.window_open_driver_rear;
        int iHashCode15 = (iHashCode14 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.window_open_passenger_rear;
        int iHashCode16 = (iHashCode15 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        Integer num = this.sun_roof_percent_open;
        int iHashCode17 = (iHashCode16 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool11 = this.locked;
        int iHashCode18 = (iHashCode17 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.is_user_present;
        int iHashCode19 = (iHashCode18 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        Boolean bool13 = this.remote_start;
        int iHashCode20 = (iHashCode19 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
        Boolean bool14 = this.valet_mode;
        int iHashCode21 = (iHashCode20 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
        Boolean bool15 = this.valet_pin_needed;
        int iHashCode22 = (iHashCode21 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
        Boolean bool16 = this.sentry_mode_available;
        int iHashCode23 = (iHashCode22 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
        vc0.g0 g0Var = this.tonneau_state;
        int iHashCode24 = (iHashCode23 + (g0Var != null ? g0Var.hashCode() : 0)) * 37;
        Integer num2 = this.tonneau_percent_open;
        int iHashCode25 = (iHashCode24 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool17 = this.tonneau_in_motion;
        int iHashCode26 = (iHashCode25 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
        Boolean bool18 = this.has_automatic_tonneau;
        int iHashCode27 = (iHashCode26 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
        Boolean bool19 = this.has_side_storage_doors;
        int iHashCode28 = (iHashCode27 + (bool19 != null ? bool19.hashCode() : 0)) * 37;
        Boolean bool20 = this.door_open_side_storage_left;
        int iHashCode29 = (iHashCode28 + (bool20 != null ? bool20.hashCode() : 0)) * 37;
        Boolean bool21 = this.door_open_side_storage_right;
        int iHashCode30 = iHashCode29 + (bool21 != null ? bool21.hashCode() : 0);
        this.hashCode = iHashCode30;
        return iHashCode30;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDoor_open_passenger_front_OBSOLETE() {
        return this.door_open_passenger_front_OBSOLETE;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getDoor_open_passenger_rear() {
        return this.door_open_passenger_rear;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getDoor_open_passenger_rear_OBSOLETE() {
        return this.door_open_passenger_rear_OBSOLETE;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getDoor_open_side_storage_left() {
        return this.door_open_side_storage_left;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getDoor_open_side_storage_right() {
        return this.door_open_side_storage_right;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getDoor_open_trunk_front() {
        return this.door_open_trunk_front;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m432newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getDoor_open_trunk_front_OBSOLETE() {
        return this.door_open_trunk_front_OBSOLETE;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getDoor_open_trunk_rear() {
        return this.door_open_trunk_rear;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getDoor_open_trunk_rear_OBSOLETE() {
        return this.door_open_trunk_rear_OBSOLETE;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getHas_automatic_tonneau() {
        return this.has_automatic_tonneau;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getHas_side_storage_doors() {
        return this.has_side_storage_doors;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getLocked() {
        return this.locked;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("door_open_driver_front_OBSOLETE=" + this.door_open_driver_front_OBSOLETE);
        arrayList.add("door_open_driver_rear_OBSOLETE=" + this.door_open_driver_rear_OBSOLETE);
        arrayList.add("door_open_passenger_front_OBSOLETE=" + this.door_open_passenger_front_OBSOLETE);
        arrayList.add("door_open_passenger_rear_OBSOLETE=" + this.door_open_passenger_rear_OBSOLETE);
        arrayList.add("door_open_trunk_front_OBSOLETE=" + this.door_open_trunk_front_OBSOLETE);
        arrayList.add("door_open_trunk_rear_OBSOLETE=" + this.door_open_trunk_rear_OBSOLETE);
        arrayList.add("window_open_driver_front_OBSOLETE=" + this.window_open_driver_front_OBSOLETE);
        arrayList.add("window_open_passenger_front_OBSOLETE=" + this.window_open_passenger_front_OBSOLETE);
        arrayList.add("window_open_driver_rear_OBSOLETE=" + this.window_open_driver_rear_OBSOLETE);
        arrayList.add("window_open_passenger_rear_OBSOLETE=" + this.window_open_passenger_rear_OBSOLETE);
        arrayList.add("sun_roof_percent_open_OBSOLETE=" + this.sun_roof_percent_open_OBSOLETE);
        arrayList.add("locked_OBSOLETE=" + this.locked_OBSOLETE);
        arrayList.add("is_user_present_OBSOLETE=" + this.is_user_present_OBSOLETE);
        arrayList.add("remote_start_OBSOLETE=" + this.remote_start_OBSOLETE);
        arrayList.add("valet_mode_OBSOLETE=" + this.valet_mode_OBSOLETE);
        arrayList.add("valet_pin_needed_OBSOLETE=" + this.valet_pin_needed_OBSOLETE);
        arrayList.add("sentry_mode_available_OBSOLETE=" + this.sentry_mode_available_OBSOLETE);
        e eVar = this.sun_roof_state;
        if (eVar != null) {
            arrayList.add("sun_roof_state=" + eVar);
        }
        c cVar = this.center_display_state;
        if (cVar != null) {
            arrayList.add("center_display_state=" + cVar);
        }
        d dVar = this.sentry_mode_state;
        if (dVar != null) {
            arrayList.add("sentry_mode_state=" + dVar);
        }
        p0 p0Var = this.speed_limit_mode;
        if (p0Var != null) {
            arrayList.add("speed_limit_mode=" + p0Var);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Boolean bool = this.door_open_driver_front;
        if (bool != null) {
            arrayList.add("door_open_driver_front=" + bool);
        }
        Boolean bool2 = this.door_open_driver_rear;
        if (bool2 != null) {
            arrayList.add("door_open_driver_rear=" + bool2);
        }
        Boolean bool3 = this.door_open_passenger_front;
        if (bool3 != null) {
            arrayList.add("door_open_passenger_front=" + bool3);
        }
        Boolean bool4 = this.door_open_passenger_rear;
        if (bool4 != null) {
            arrayList.add("door_open_passenger_rear=" + bool4);
        }
        Boolean bool5 = this.door_open_trunk_front;
        if (bool5 != null) {
            arrayList.add("door_open_trunk_front=" + bool5);
        }
        Boolean bool6 = this.door_open_trunk_rear;
        if (bool6 != null) {
            arrayList.add("door_open_trunk_rear=" + bool6);
        }
        Boolean bool7 = this.window_open_driver_front;
        if (bool7 != null) {
            arrayList.add("window_open_driver_front=" + bool7);
        }
        Boolean bool8 = this.window_open_passenger_front;
        if (bool8 != null) {
            arrayList.add("window_open_passenger_front=" + bool8);
        }
        Boolean bool9 = this.window_open_driver_rear;
        if (bool9 != null) {
            arrayList.add("window_open_driver_rear=" + bool9);
        }
        Boolean bool10 = this.window_open_passenger_rear;
        if (bool10 != null) {
            arrayList.add("window_open_passenger_rear=" + bool10);
        }
        Integer num = this.sun_roof_percent_open;
        if (num != null) {
            arrayList.add("sun_roof_percent_open=" + num);
        }
        Boolean bool11 = this.locked;
        if (bool11 != null) {
            arrayList.add("locked=" + bool11);
        }
        Boolean bool12 = this.is_user_present;
        if (bool12 != null) {
            arrayList.add("is_user_present=" + bool12);
        }
        Boolean bool13 = this.remote_start;
        if (bool13 != null) {
            arrayList.add("remote_start=" + bool13);
        }
        Boolean bool14 = this.valet_mode;
        if (bool14 != null) {
            arrayList.add("valet_mode=" + bool14);
        }
        Boolean bool15 = this.valet_pin_needed;
        if (bool15 != null) {
            arrayList.add("valet_pin_needed=" + bool15);
        }
        Boolean bool16 = this.sentry_mode_available;
        if (bool16 != null) {
            arrayList.add("sentry_mode_available=" + bool16);
        }
        vc0.g0 g0Var = this.tonneau_state;
        if (g0Var != null) {
            arrayList.add("tonneau_state=" + g0Var);
        }
        Integer num2 = this.tonneau_percent_open;
        if (num2 != null) {
            arrayList.add("tonneau_percent_open=" + num2);
        }
        Boolean bool17 = this.tonneau_in_motion;
        if (bool17 != null) {
            arrayList.add("tonneau_in_motion=" + bool17);
        }
        Boolean bool18 = this.has_automatic_tonneau;
        if (bool18 != null) {
            arrayList.add("has_automatic_tonneau=" + bool18);
        }
        Boolean bool19 = this.has_side_storage_doors;
        if (bool19 != null) {
            arrayList.add("has_side_storage_doors=" + bool19);
        }
        Boolean bool20 = this.door_open_side_storage_left;
        if (bool20 != null) {
            arrayList.add("door_open_side_storage_left=" + bool20);
        }
        Boolean bool21 = this.door_open_side_storage_right;
        if (bool21 != null) {
            arrayList.add("door_open_side_storage_right=" + bool21);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ClosuresState{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getLocked_OBSOLETE() {
        return this.locked_OBSOLETE;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Boolean getRemote_start() {
        return this.remote_start;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getRemote_start_OBSOLETE() {
        return this.remote_start_OBSOLETE;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Boolean getSentry_mode_available() {
        return this.sentry_mode_available;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getSentry_mode_available_OBSOLETE() {
        return this.sentry_mode_available_OBSOLETE;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final d getSentry_mode_state() {
        return this.sentry_mode_state;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, e eVar, c cVar, d dVar, p0 p0Var, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, vc0.g0 g0Var, Integer num2, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, okio.k kVar, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z28 = (i12 & 1) != 0 ? false : z11;
        this(z28, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15, (i12 & 32) != 0 ? false : z16, (i12 & 64) != 0 ? false : z17, (i12 & 128) != 0 ? false : z18, (i12 & 256) != 0 ? false : z19, (i12 & 512) != 0 ? false : z21, (i12 & 1024) != 0 ? 0 : i11, (i12 & 2048) != 0 ? false : z22, (i12 & 4096) != 0 ? false : z23, (i12 & PKIFailureInfo.certRevoked) != 0 ? false : z24, (i12 & 16384) != 0 ? false : z25, (i12 & 32768) != 0 ? false : z26, (i12 & 65536) != 0 ? false : z27, (i12 & 131072) != 0 ? null : eVar, (i12 & 262144) != 0 ? null : cVar, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? null : dVar, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? null : p0Var, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? null : instant, (i12 & 4194304) != 0 ? null : bool, (i12 & 8388608) != 0 ? null : bool2, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool3, (i12 & 33554432) != 0 ? null : bool4, (i12 & 67108864) != 0 ? null : bool5, (i12 & 134217728) != 0 ? null : bool6, (i12 & 268435456) != 0 ? null : bool7, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? null : bool8, (i12 & 1073741824) != 0 ? null : bool9, (i12 & Integer.MIN_VALUE) != 0 ? null : bool10, (i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : bool11, (i13 & 4) != 0 ? null : bool12, (i13 & 8) != 0 ? null : bool13, (i13 & 16) != 0 ? null : bool14, (i13 & 32) != 0 ? null : bool15, (i13 & 64) != 0 ? null : bool16, (i13 & 128) != 0 ? null : g0Var, (i13 & 256) != 0 ? null : num2, (i13 & 512) != 0 ? null : bool17, (i13 & 1024) != 0 ? null : bool18, (i13 & 2048) != 0 ? null : bool19, (i13 & 4096) != 0 ? null : bool20, (i13 & PKIFailureInfo.certRevoked) == 0 ? bool21 : null, (i13 & 16384) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m432newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, e eVar, c cVar, d dVar, p0 p0Var, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, vc0.g0 g0Var, Integer num2, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, okio.k unknownFields) {
        super(V, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.door_open_driver_front_OBSOLETE = z11;
        this.door_open_driver_rear_OBSOLETE = z12;
        this.door_open_passenger_front_OBSOLETE = z13;
        this.door_open_passenger_rear_OBSOLETE = z14;
        this.door_open_trunk_front_OBSOLETE = z15;
        this.door_open_trunk_rear_OBSOLETE = z16;
        this.window_open_driver_front_OBSOLETE = z17;
        this.window_open_passenger_front_OBSOLETE = z18;
        this.window_open_driver_rear_OBSOLETE = z19;
        this.window_open_passenger_rear_OBSOLETE = z21;
        this.sun_roof_percent_open_OBSOLETE = i11;
        this.locked_OBSOLETE = z22;
        this.is_user_present_OBSOLETE = z23;
        this.remote_start_OBSOLETE = z24;
        this.valet_mode_OBSOLETE = z25;
        this.valet_pin_needed_OBSOLETE = z26;
        this.sentry_mode_available_OBSOLETE = z27;
        this.sun_roof_state = eVar;
        this.center_display_state = cVar;
        this.sentry_mode_state = dVar;
        this.speed_limit_mode = p0Var;
        this.timestamp = instant;
        this.door_open_driver_front = bool;
        this.door_open_driver_rear = bool2;
        this.door_open_passenger_front = bool3;
        this.door_open_passenger_rear = bool4;
        this.door_open_trunk_front = bool5;
        this.door_open_trunk_rear = bool6;
        this.window_open_driver_front = bool7;
        this.window_open_passenger_front = bool8;
        this.window_open_driver_rear = bool9;
        this.window_open_passenger_rear = bool10;
        this.sun_roof_percent_open = num;
        this.locked = bool11;
        this.is_user_present = bool12;
        this.remote_start = bool13;
        this.valet_mode = bool14;
        this.valet_pin_needed = bool15;
        this.sentry_mode_available = bool16;
        this.tonneau_state = g0Var;
        this.tonneau_percent_open = num2;
        this.tonneau_in_motion = bool17;
        this.has_automatic_tonneau = bool18;
        this.has_side_storage_doors = bool19;
        this.door_open_side_storage_left = bool20;
        this.door_open_side_storage_right = bool21;
    }
}
