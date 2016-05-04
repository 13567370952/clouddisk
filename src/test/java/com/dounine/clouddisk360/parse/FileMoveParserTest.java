package com.dounine.clouddisk360.parse;

import com.dounine.clouddisk360.parser.FileMoveParser;
import com.dounine.clouddisk360.parser.deserializer.file.move.FileMove;
import com.dounine.clouddisk360.parser.deserializer.file.move.FileMoveParameter;
import com.dounine.clouddisk360.parser.deserializer.login.LoginUserToken;
import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileMoveParserTest extends TestCase {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileMoveParserTest.class);

	public void testParse() {
		final LoginUserToken loginUserToken = TestUser.LOGIN_USER_TOKEN;

		final FileMoveParser fileMoveParser = new FileMoveParser(loginUserToken);
		final FileMoveParameter fileMoveParameter = new FileMoveParameter();
		fileMoveParameter.getMoveFiles().add("/a/");
		fileMoveParameter.setNewPath("/黄/");
		final FileMove fileMove = fileMoveParser.parse(fileMoveParameter);

		LOGGER.info(fileMove.toString());
	}
}
