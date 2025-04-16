# InsightFlow AI 模块

本目录包含 InsightFlow 项目的 AI 模型和算法实现。

## 功能概述

AI 模块是 InsightFlow 系统的核心，负责以下关键功能：

1. **文档内容提取和结构化**：从 PDF、Word、Excel 等格式文件中提取文本和结构化信息
2. **文件分类和标签化**：自动对文件进行分类并添加标签
3. **流程识别和构建**：从文件内容中识别业务流程和处理节点
4. **自然语言查询处理**：处理用户的自然语言问题并生成回答

## 目录结构

```
ai/
├── models/              # AI 模型定义和权重
├── processors/          # 文档处理器
│   ├── pdf/             # PDF 处理
│   ├── doc/             # Word 文档处理
│   └── excel/           # Excel 处理
├── classifiers/         # 文件分类器
├── extractors/          # 信息提取器
├── process_mining/      # 流程挖掘算法
├── nlp/                 # 自然语言处理
├── utils/               # AI 相关工具函数
└── README.md            # 说明文档
```

## 技术选择

### 文档处理

- PDF 处理: [Apache Tika](https://tika.apache.org/), [PyPDF2](https://pypdf2.readthedocs.io/)
- Word 处理: [python-docx](https://python-docx.readthedocs.io/)
- Excel 处理: [pandas](https://pandas.pydata.org/), [openpyxl](https://openpyxl.readthedocs.io/)
- 通用文本提取: [Marker](https://github.com/VikParuchuri/marker)

### 大语言模型

- 开源模型: [待定] (如 LLaMA, Mistral, Falcon 等)
- 商业 API: [待定] (如 OpenAI GPT, Claude 等)

### 流程挖掘

- 自定义算法: 基于大语言模型的流程识别
- 传统流程挖掘算法的扩展

## 模型训练和部署

### 环境设置

```
# 待定
```

### 数据准备

```
# 待定
```

### 模型训练

```
# 待定
```

### 模型评估

```
# 待定
```

### 模型部署

```
# 待定
```

## 与后端集成

AI 模块将通过以下方式与后端集成：

1. **API 接口**：提供 RESTful API 供后端调用
2. **异步处理**：处理大型文件和复杂查询的异步任务
3. **模型缓存**：优化模型加载和推理性能

## 参考资料

- [Apache Tika](https://tika.apache.org/)
- [Marker](https://github.com/VikParuchuri/marker?tab=readme-ov-file)
- [相关研究论文](https://arxiv.org/abs/2310.03376)