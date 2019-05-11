package com.pdfReport;


import java.io.BufferedReader;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class PdfText {
		private static final String TXT = "src/main/resources/txt.txt";
		public static void main(String[] args) {
			try {		
				generatePDFFromTxt(TXT);
			} catch (IOException | DocumentException e) {
				e.printStackTrace();
			}
		}
		
		private static void generatePDFFromTxt(String filename) throws IOException, DocumentException {
			Document pdfDoc = new Document(PageSize.A4);
			PdfWriter.getInstance(pdfDoc, new FileOutputStream("src/main/resources/txt.pdf"))
					.setPdfVersion(PdfWriter.PDF_VERSION_1_7);
			pdfDoc.open();
			Font myfont = new Font();
			myfont.setStyle(Font.NORMAL);
			myfont.setSize(11);
			pdfDoc.add(new Paragraph("\n"));
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				Paragraph para = new Paragraph(strLine + "\n", myfont);
				para.setAlignment(Element.ALIGN_JUSTIFIED);
				pdfDoc.add(para);
			}
			pdfDoc.close();
			br.close();
		}
		
}
