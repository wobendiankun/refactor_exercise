/**
 * 
 * @author wumingkun
 * @version 1.0.0
 * @Description
 */

package com.demo.refactor.state.after;

/**
 * @author wumingkun
 *
 */
public class TypeB extends StudentType {



	/* (non-Javadoc)
	 * @see com.refractor.subcode.after.StudentManagement#getType()
	 */
	@Override
	public int getType() {
		return Student.B;
	}

	@Override
	public String toString() {
		return "TypeB [type=" + getType() + "]";
	}
	
}
