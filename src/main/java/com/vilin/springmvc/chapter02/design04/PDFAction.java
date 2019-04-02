package com.vilin.springmvc.chapter02.design04;

public class PDFAction {
    private PDFService pdfService;

    public void setPDFService(PDFService pdfService) {
        this.pdfService = pdfService;
    }

    public void createPDF(String path, String input) {
        pdfService.createPDF(path, input);
    }
}
