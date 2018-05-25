package zql.app_jinnang.Model;

import android.database.Cursor;

import java.util.List;

import zql.app_jinnang.Bean.NoteBean;

/**
 * Created by 尽途 on 2018/4/4.
 */

public interface NoteInfoModelImp {
    public void InsertNotetoData(NoteBean noteBean);
    public void DeleteNotefromData(NoteBean noteBean);
    public List<NoteBean> QueryAllNotefromData();
    public List<NoteBean> QueryNoyefromDataByType(String READ_TYPE);
    public List<String> QueryNotecreatetime();
    public List<NoteBean> QueryNotebeanBycreatetime(String creaetime);
    public void ChangeNotetoData(NoteBean noteBean);
    public void DeleteNotefromDataByid(Long id);
    public Cursor getCursorfromData(String search);
    public List<NoteBean> getSearchfromData(String search);
}