package day0909.spring.upload;

import org.

public class uploadDAO extends SqlSessionDaoSupport{

	public int insertFile(uploadfileVo dto){
		int i = getSqlSession().insert("file.addFile", file);
		return i;
	}
	
}
