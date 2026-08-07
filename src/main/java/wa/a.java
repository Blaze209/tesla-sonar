package wa;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a%\u0010\u0001\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0001\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/database/Cursor;", "c", "a", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", "name", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/database/Cursor;Ljava/lang/String;)I", "e", "cursor", "b", "", "columnNames", "([Ljava/lang/String;Ljava/lang/String;)I", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final Cursor a(Cursor c11) {
        p013kotlin.jvm.internal.s.k(c11, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c11.getColumnNames(), c11.getCount());
            while (c11.moveToNext()) {
                Object[] objArr = new Object[c11.getColumnCount()];
                int columnCount = c11.getColumnCount();
                for (int i11 = 0; i11 < columnCount; i11++) {
                    int type = c11.getType(i11);
                    if (type == 0) {
                        objArr[i11] = null;
                    } else if (type == 1) {
                        objArr[i11] = Long.valueOf(c11.getLong(i11));
                    } else if (type == 2) {
                        objArr[i11] = Double.valueOf(c11.getDouble(i11));
                    } else if (type == 3) {
                        objArr[i11] = c11.getString(i11);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i11] = c11.getBlob(i11);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            sn0.b.a(c11, null);
            return matrixCursor;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(c11, th2);
                throw th3;
            }
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        p013kotlin.jvm.internal.s.h(columnNames);
        return c(columnNames, str);
    }

    public static final int c(String[] columnNames, String name) {
        p013kotlin.jvm.internal.s.k(columnNames, "columnNames");
        p013kotlin.jvm.internal.s.k(name, "name");
        String str = CoreConstants.DOT + name;
        String str2 = CoreConstants.DOT + name + '`';
        int length = columnNames.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str3 = columnNames[i11];
            int i13 = i12 + 1;
            if (str3.length() >= name.length() + 2 && (t.L(str3, str, false, 2, null) || (str3.charAt(0) == '`' && t.L(str3, str2, false, 2, null)))) {
                return i12;
            }
            i11++;
            i12 = i13;
        }
        return -1;
    }

    public static final int d(Cursor c11, String name) {
        p013kotlin.jvm.internal.s.k(c11, "c");
        p013kotlin.jvm.internal.s.k(name, "name");
        int columnIndex = c11.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c11.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c11, name);
    }

    public static final int e(Cursor c11, String name) {
        String strT0;
        p013kotlin.jvm.internal.s.k(c11, "c");
        p013kotlin.jvm.internal.s.k(name, "name");
        int iD = d(c11, name);
        if (iD >= 0) {
            return iD;
        }
        try {
            String[] columnNames = c11.getColumnNames();
            p013kotlin.jvm.internal.s.j(columnNames, "getColumnNames(...)");
            strT0 = p013kotlin.collections.n.T0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e11) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e11);
            strT0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strT0);
    }
}
