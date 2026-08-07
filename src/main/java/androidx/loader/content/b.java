package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import q5.e;

/* JADX INFO: loaded from: classes.dex */
public class b extends a<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c<Cursor>.a f8971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Uri f8972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f8973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f8974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String[] f8975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f8976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Cursor f8977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e f8978h;

    public b(@NonNull Context context, @NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f8971a = new c.a();
        this.f8972b = uri;
        this.f8973c = strArr;
        this.f8974d = str;
        this.f8975e = strArr2;
        this.f8976f = str2;
    }

    @Override // androidx.loader.content.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f8977g;
        this.f8977g = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.f8978h = new e();
        }
        try {
            Cursor cursorB = androidx.core.content.a.b(getContext().getContentResolver(), this.f8972b, this.f8973c, this.f8974d, this.f8975e, this.f8976f, this.f8978h);
            if (cursorB != null) {
                try {
                    cursorB.getCount();
                    cursorB.registerContentObserver(this.f8971a);
                } catch (RuntimeException e11) {
                    cursorB.close();
                    throw e11;
                }
            }
            synchronized (this) {
                this.f8978h = null;
            }
            return cursorB;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f8978h = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.a
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                e eVar = this.f8978h;
                if (eVar != null) {
                    eVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f8972b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f8973c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f8974d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f8975e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f8976f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f8977g);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    @Override // androidx.loader.content.c
    protected void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f8977g;
        if (cursor != null && !cursor.isClosed()) {
            this.f8977g.close();
        }
        this.f8977g = null;
    }

    @Override // androidx.loader.content.c
    protected void onStartLoading() {
        Cursor cursor = this.f8977g;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f8977g == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.c
    protected void onStopLoading() {
        cancelLoad();
    }
}
