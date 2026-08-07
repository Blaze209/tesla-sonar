package p016o2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import k3.p1;
import p007h2.SelectionColors;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\bN\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100JÀ\u0003\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r03H\u0000¢\u0006\u0004\b5\u00106J-\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010<J-\u0010>\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010<J-\u0010?\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010<J-\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010<J-\u0010A\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010<J-\u0010B\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010<J-\u0010C\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010<J-\u0010D\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010<J-\u0010E\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010<J\u001d\u0010F\u001a\u00020\u00022\u0006\u00109\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bQ\u0010PR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010PR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\bT\u0010PR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010N\u001a\u0004\bW\u0010PR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010N\u001a\u0004\bX\u0010PR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010N\u001a\u0004\bY\u0010PR\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010N\u001a\u0004\bZ\u0010PR\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010N\u001a\u0004\b[\u0010PR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bE\u0010\\\u001a\u0004\bU\u0010]R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010N\u001a\u0004\b^\u0010PR\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\b_\u0010PR\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010N\u001a\u0004\b`\u0010PR\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010N\u001a\u0004\ba\u0010PR\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010N\u001a\u0004\bc\u0010PR\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bd\u0010N\u001a\u0004\be\u0010PR\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bf\u0010N\u001a\u0004\bg\u0010PR\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010N\u001a\u0004\bi\u0010PR\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010N\u001a\u0004\bk\u0010PR\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bl\u0010N\u001a\u0004\bm\u0010PR\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bn\u0010N\u001a\u0004\bo\u0010PR\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010N\u001a\u0004\bq\u0010PR\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\br\u0010N\u001a\u0004\bs\u0010PR\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bt\u0010N\u001a\u0004\bu\u0010PR\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010N\u001a\u0004\bw\u0010PR\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bx\u0010N\u001a\u0004\by\u0010PR\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bz\u0010N\u001a\u0004\b{\u0010PR\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b|\u0010N\u001a\u0004\b}\u0010PR\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b~\u0010N\u001a\u0004\b\u007f\u0010PR\u001f\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010N\u001a\u0005\b\u0081\u0001\u0010PR\u001f\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010N\u001a\u0005\b\u0083\u0001\u0010PR\u001f\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010N\u001a\u0005\b\u0085\u0001\u0010PR\u001f\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010N\u001a\u0005\b\u0087\u0001\u0010PR\u001f\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010N\u001a\u0005\b\u0089\u0001\u0010PR\u001e\u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\bN\u0010N\u001a\u0005\b\u008a\u0001\u0010PR\u001f\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010N\u001a\u0005\b\u008c\u0001\u0010PR\u001f\u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010N\u001a\u0005\b\u008e\u0001\u0010PR\u001f\u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010N\u001a\u0005\b\u0090\u0001\u0010PR\u001f\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010N\u001a\u0005\b\u0092\u0001\u0010PR\u001f\u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010N\u001a\u0005\b\u0094\u0001\u0010PR\u001f\u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010N\u001a\u0005\b\u0096\u0001\u0010PR\u001f\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010N\u001a\u0005\b\u0098\u0001\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0099\u0001"}, d2 = {"Lo2/n0;", "", "Lk3/p1;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Lh2/l0;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLh2/l0;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "(JJJJJJJJJJLh2/l0;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lo2/n0;", "Lkotlin/Function0;", "block", "m", "(Lh2/l0;Lwn0/a;)Lh2/l0;", "", "enabled", "isError", "focused", "h", "(ZZZ)J", "o", "f", "a", IntegerTokenConverter.CONVERTER_KEY, "g", "n", "l", "j", "k", DateTokenConverter.CONVERTER_KEY, "(Z)J", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getFocusedTextColor-0d7_KjU", "()J", "getUnfocusedTextColor-0d7_KjU", "c", "getDisabledTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "e", "getFocusedContainerColor-0d7_KjU", "getUnfocusedContainerColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getCursorColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "Lh2/l0;", "()Lh2/l0;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "p", "getFocusedLeadingIconColor-0d7_KjU", "q", "getUnfocusedLeadingIconColor-0d7_KjU", "r", "getDisabledLeadingIconColor-0d7_KjU", "s", "getErrorLeadingIconColor-0d7_KjU", "t", "getFocusedTrailingIconColor-0d7_KjU", "u", "getUnfocusedTrailingIconColor-0d7_KjU", "v", "getDisabledTrailingIconColor-0d7_KjU", "w", "getErrorTrailingIconColor-0d7_KjU", "x", "getFocusedLabelColor-0d7_KjU", "y", "getUnfocusedLabelColor-0d7_KjU", "z", "getDisabledLabelColor-0d7_KjU", "A", "getErrorLabelColor-0d7_KjU", "B", "getFocusedPlaceholderColor-0d7_KjU", "C", "getUnfocusedPlaceholderColor-0d7_KjU", "D", "getDisabledPlaceholderColor-0d7_KjU", "E", "getErrorPlaceholderColor-0d7_KjU", Gender.FEMALE, "getFocusedSupportingTextColor-0d7_KjU", "G", "getUnfocusedSupportingTextColor-0d7_KjU", "H", "getDisabledSupportingTextColor-0d7_KjU", "I", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "K", "getUnfocusedPrefixColor-0d7_KjU", "L", "getDisabledPrefixColor-0d7_KjU", Gender.MALE, "getErrorPrefixColor-0d7_KjU", Gender.NONE, "getFocusedSuffixColor-0d7_KjU", Gender.OTHER, "getUnfocusedSuffixColor-0d7_KjU", "P", "getDisabledSuffixColor-0d7_KjU", "Q", "getErrorSuffixColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long errorLabelColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final long focusedPlaceholderColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final long unfocusedPlaceholderColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final long disabledPlaceholderColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final long errorPlaceholderColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final long focusedSupportingTextColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final long unfocusedSupportingTextColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long disabledSupportingTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final long errorSupportingTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final long focusedPrefixColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final long unfocusedPrefixColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final long disabledPrefixColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final long errorPrefixColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final long focusedSuffixColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final long unfocusedSuffixColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final long disabledSuffixColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final long errorSuffixColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long focusedTextColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long errorTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long focusedContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedContainerColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long errorContainerColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long cursorColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long errorCursorColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SelectionColors textSelectionColors;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long focusedIndicatorColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndicatorColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long errorIndicatorColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long focusedLeadingIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLeadingIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long errorLeadingIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long focusedTrailingIconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedTrailingIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long errorTrailingIconColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long focusedLabelColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLabelColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh2/l0;", "b", "()Lh2/l0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<SelectionColors> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SelectionColors invoke() {
            return n0.this.getTextSelectionColors();
        }
    }

    public /* synthetic */ n0(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, SelectionColors selectionColors, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j51, long j52, long j53, long j54, long j55, long j56, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, selectionColors, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33, j34, j35, j36, j37, j38, j39, j41, j42, j43, j44, j45, j46, j47, j48, j49, j51, j52, j53, j54, j55, j56);
    }

    public final long a(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledContainerColor;
        }
        if (isError) {
            return this.errorContainerColor;
        }
        return focused ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    public final n0 b(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, SelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new n0(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, m(textSelectionColors, new a()), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    public final long d(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final SelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) other;
        return p1.r(this.focusedTextColor, n0Var.focusedTextColor) && p1.r(this.unfocusedTextColor, n0Var.unfocusedTextColor) && p1.r(this.disabledTextColor, n0Var.disabledTextColor) && p1.r(this.errorTextColor, n0Var.errorTextColor) && p1.r(this.focusedContainerColor, n0Var.focusedContainerColor) && p1.r(this.unfocusedContainerColor, n0Var.unfocusedContainerColor) && p1.r(this.disabledContainerColor, n0Var.disabledContainerColor) && p1.r(this.errorContainerColor, n0Var.errorContainerColor) && p1.r(this.cursorColor, n0Var.cursorColor) && p1.r(this.errorCursorColor, n0Var.errorCursorColor) && s.f(this.textSelectionColors, n0Var.textSelectionColors) && p1.r(this.focusedIndicatorColor, n0Var.focusedIndicatorColor) && p1.r(this.unfocusedIndicatorColor, n0Var.unfocusedIndicatorColor) && p1.r(this.disabledIndicatorColor, n0Var.disabledIndicatorColor) && p1.r(this.errorIndicatorColor, n0Var.errorIndicatorColor) && p1.r(this.focusedLeadingIconColor, n0Var.focusedLeadingIconColor) && p1.r(this.unfocusedLeadingIconColor, n0Var.unfocusedLeadingIconColor) && p1.r(this.disabledLeadingIconColor, n0Var.disabledLeadingIconColor) && p1.r(this.errorLeadingIconColor, n0Var.errorLeadingIconColor) && p1.r(this.focusedTrailingIconColor, n0Var.focusedTrailingIconColor) && p1.r(this.unfocusedTrailingIconColor, n0Var.unfocusedTrailingIconColor) && p1.r(this.disabledTrailingIconColor, n0Var.disabledTrailingIconColor) && p1.r(this.errorTrailingIconColor, n0Var.errorTrailingIconColor) && p1.r(this.focusedLabelColor, n0Var.focusedLabelColor) && p1.r(this.unfocusedLabelColor, n0Var.unfocusedLabelColor) && p1.r(this.disabledLabelColor, n0Var.disabledLabelColor) && p1.r(this.errorLabelColor, n0Var.errorLabelColor) && p1.r(this.focusedPlaceholderColor, n0Var.focusedPlaceholderColor) && p1.r(this.unfocusedPlaceholderColor, n0Var.unfocusedPlaceholderColor) && p1.r(this.disabledPlaceholderColor, n0Var.disabledPlaceholderColor) && p1.r(this.errorPlaceholderColor, n0Var.errorPlaceholderColor) && p1.r(this.focusedSupportingTextColor, n0Var.focusedSupportingTextColor) && p1.r(this.unfocusedSupportingTextColor, n0Var.unfocusedSupportingTextColor) && p1.r(this.disabledSupportingTextColor, n0Var.disabledSupportingTextColor) && p1.r(this.errorSupportingTextColor, n0Var.errorSupportingTextColor) && p1.r(this.focusedPrefixColor, n0Var.focusedPrefixColor) && p1.r(this.unfocusedPrefixColor, n0Var.unfocusedPrefixColor) && p1.r(this.disabledPrefixColor, n0Var.disabledPrefixColor) && p1.r(this.errorPrefixColor, n0Var.errorPrefixColor) && p1.r(this.focusedSuffixColor, n0Var.focusedSuffixColor) && p1.r(this.unfocusedSuffixColor, n0Var.unfocusedSuffixColor) && p1.r(this.disabledSuffixColor, n0Var.disabledSuffixColor) && p1.r(this.errorSuffixColor, n0Var.errorSuffixColor);
    }

    public final long f(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledIndicatorColor;
        }
        if (isError) {
            return this.errorIndicatorColor;
        }
        return focused ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    public final long g(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLabelColor;
        }
        if (isError) {
            return this.errorLabelColor;
        }
        return focused ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    public final long h(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLeadingIconColor;
        }
        if (isError) {
            return this.errorLeadingIconColor;
        }
        return focused ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((p1.x(this.focusedTextColor) * 31) + p1.x(this.unfocusedTextColor)) * 31) + p1.x(this.disabledTextColor)) * 31) + p1.x(this.errorTextColor)) * 31) + p1.x(this.focusedContainerColor)) * 31) + p1.x(this.unfocusedContainerColor)) * 31) + p1.x(this.disabledContainerColor)) * 31) + p1.x(this.errorContainerColor)) * 31) + p1.x(this.cursorColor)) * 31) + p1.x(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + p1.x(this.focusedIndicatorColor)) * 31) + p1.x(this.unfocusedIndicatorColor)) * 31) + p1.x(this.disabledIndicatorColor)) * 31) + p1.x(this.errorIndicatorColor)) * 31) + p1.x(this.focusedLeadingIconColor)) * 31) + p1.x(this.unfocusedLeadingIconColor)) * 31) + p1.x(this.disabledLeadingIconColor)) * 31) + p1.x(this.errorLeadingIconColor)) * 31) + p1.x(this.focusedTrailingIconColor)) * 31) + p1.x(this.unfocusedTrailingIconColor)) * 31) + p1.x(this.disabledTrailingIconColor)) * 31) + p1.x(this.errorTrailingIconColor)) * 31) + p1.x(this.focusedLabelColor)) * 31) + p1.x(this.unfocusedLabelColor)) * 31) + p1.x(this.disabledLabelColor)) * 31) + p1.x(this.errorLabelColor)) * 31) + p1.x(this.focusedPlaceholderColor)) * 31) + p1.x(this.unfocusedPlaceholderColor)) * 31) + p1.x(this.disabledPlaceholderColor)) * 31) + p1.x(this.errorPlaceholderColor)) * 31) + p1.x(this.focusedSupportingTextColor)) * 31) + p1.x(this.unfocusedSupportingTextColor)) * 31) + p1.x(this.disabledSupportingTextColor)) * 31) + p1.x(this.errorSupportingTextColor)) * 31) + p1.x(this.focusedPrefixColor)) * 31) + p1.x(this.unfocusedPrefixColor)) * 31) + p1.x(this.disabledPrefixColor)) * 31) + p1.x(this.errorPrefixColor)) * 31) + p1.x(this.focusedSuffixColor)) * 31) + p1.x(this.unfocusedSuffixColor)) * 31) + p1.x(this.disabledSuffixColor)) * 31) + p1.x(this.errorSuffixColor);
    }

    public final long i(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPlaceholderColor;
        }
        if (isError) {
            return this.errorPlaceholderColor;
        }
        return focused ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    public final long j(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPrefixColor;
        }
        if (isError) {
            return this.errorPrefixColor;
        }
        return focused ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    public final long k(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSuffixColor;
        }
        if (isError) {
            return this.errorSuffixColor;
        }
        return focused ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    public final long l(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSupportingTextColor;
        }
        if (isError) {
            return this.errorSupportingTextColor;
        }
        return focused ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public final SelectionColors m(SelectionColors selectionColors, wn0.a<SelectionColors> aVar) {
        return selectionColors == null ? aVar.invoke() : selectionColors;
    }

    public final long n(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTextColor;
        }
        if (isError) {
            return this.errorTextColor;
        }
        return focused ? this.focusedTextColor : this.unfocusedTextColor;
    }

    public final long o(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTrailingIconColor;
        }
        if (isError) {
            return this.errorTrailingIconColor;
        }
        return focused ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    private n0(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, SelectionColors selectionColors, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j51, long j52, long j53, long j54, long j55, long j56) {
        this.focusedTextColor = j11;
        this.unfocusedTextColor = j12;
        this.disabledTextColor = j13;
        this.errorTextColor = j14;
        this.focusedContainerColor = j15;
        this.unfocusedContainerColor = j16;
        this.disabledContainerColor = j17;
        this.errorContainerColor = j18;
        this.cursorColor = j19;
        this.errorCursorColor = j21;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j22;
        this.unfocusedIndicatorColor = j23;
        this.disabledIndicatorColor = j24;
        this.errorIndicatorColor = j25;
        this.focusedLeadingIconColor = j26;
        this.unfocusedLeadingIconColor = j27;
        this.disabledLeadingIconColor = j28;
        this.errorLeadingIconColor = j29;
        this.focusedTrailingIconColor = j31;
        this.unfocusedTrailingIconColor = j32;
        this.disabledTrailingIconColor = j33;
        this.errorTrailingIconColor = j34;
        this.focusedLabelColor = j35;
        this.unfocusedLabelColor = j36;
        this.disabledLabelColor = j37;
        this.errorLabelColor = j38;
        this.focusedPlaceholderColor = j39;
        this.unfocusedPlaceholderColor = j41;
        this.disabledPlaceholderColor = j42;
        this.errorPlaceholderColor = j43;
        this.focusedSupportingTextColor = j44;
        this.unfocusedSupportingTextColor = j45;
        this.disabledSupportingTextColor = j46;
        this.errorSupportingTextColor = j47;
        this.focusedPrefixColor = j48;
        this.unfocusedPrefixColor = j49;
        this.disabledPrefixColor = j51;
        this.errorPrefixColor = j52;
        this.focusedSuffixColor = j53;
        this.unfocusedSuffixColor = j54;
        this.disabledSuffixColor = j55;
        this.errorSuffixColor = j56;
    }
}
